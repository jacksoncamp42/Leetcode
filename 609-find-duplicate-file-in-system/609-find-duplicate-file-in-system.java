class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> lst = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i < paths.length; i++) {
            int pathIndex = 0;           
            while(pathIndex < paths[i].length() && paths[i].charAt(pathIndex) != ' ') {
                pathIndex++;
            }
            
            String pathName = paths[i].substring(0, pathIndex) + "/";    
            int fileIndex = pathIndex + 1;
             
            while(fileIndex < paths[i].length()) {
                if(paths[i].charAt(fileIndex) == ' ') {
                    fileIndex++;
                }
                int fileStart = fileIndex;
                while(paths[i].charAt(fileIndex) != '(' && fileIndex < paths[i].length()) {
                    fileIndex++;
                }
                String fileName = paths[i].substring(fileStart, fileIndex);
                fileIndex++;
                int contentStart = fileIndex;
                while(paths[i].charAt(fileIndex) != ')' && fileIndex < paths[i].length()) {
                    fileIndex++;
                }
                
                String fileContent = paths[i].substring(contentStart, fileIndex);    
                fileIndex++;
                String filePath = pathName + fileName;
                
                if(map.containsKey(fileContent)) {
                    List<String> list = map.get(fileContent);
                    list.add(filePath);
                    map.put(fileContent, list);
                }
                else {
                    List<String> list = new ArrayList<>();
                    list.add(filePath);
                    map.put(fileContent, list);
                }
            }
        }
        
        List<List<String>> res = new ArrayList<List<String>>();
        for(String s : map.keySet()) {
            if(map.get(s).size() > 1) {
                res.add(map.get(s));
            }
        }
        return res;
    }
}