class Solution {
    public boolean squareIsWhite(String coordinates) {
        String a="aceg";
        String b="bdfh";
        String c="1357";
        String d="2468";
        if((a.indexOf(coordinates.charAt(0))!=-1 && c.indexOf(coordinates.charAt(1))!=-1) || (b.indexOf(coordinates.charAt(0))!=-1 && d.indexOf(coordinates.charAt(1))!=-1)){
            return false;
        }
        else
        return true;
    }
}