/*
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. 
Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
*/
class Solution {
    public String destCity(List<List<String>> paths) {
        int size = paths.size();
        if ( size == 1)
        return paths.get(0).get(1);
        for(int i=0;i<size;i++){
            String str = paths.get(i).get(1);
            int j;
            for(j=0;j<size;j++){
                if(i==j) continue;
                if(str.equals(paths.get(j).get(0)))
                break;

            }
            if(j==size)
            return str;
        }
        return "";
    }
}
