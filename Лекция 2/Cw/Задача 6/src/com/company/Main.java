package com.company;

public class Main {

    public static void main(String[] args) {
        NetworkInfo n = create("Test", "147258zxc", "WPA2");
        n.showParameters();
    }

    public static NetworkInfo create(String s, String p, String t){
        NetworkInfo n = new NetworkInfo();
        n.ssid = s;
        n.passwd = p;
        n.securityType = t;

        return n;
    }

    static class NetworkInfo {
        private String ssid;
        private String passwd;
        private String securityType;

        public void showParameters(){
            System.out.println("Имя: "+this.ssid+"\nПароль: "+
                    this.passwd+"\nТип безопасности: "+this.securityType);
        }
    }
}
