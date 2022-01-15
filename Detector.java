String message = "message here that want to check";
        message = message.replace("\n","").replace(" ","");
        int up,low,other,num = 0;
        low = 0; up = 0;
        other = 0;
        for(String m : message.split("")){
            try{
                Integer.parseInt(m);
                num++;
            }catch (NumberFormatException e){
                if( m.equalsIgnoreCase( "." ) || m.equalsIgnoreCase( "_" ) || m.equalsIgnoreCase( "-" ) ){
                    other++;
                }else if( m.equals(m.toLowerCase()) ){
                    low++;
                }else if( m.equals(m.toUpperCase()) ){
                    up++;
                }
            }

        }
        int len = message.split( "" ).length;
        if(up > 10 && low > 10 && num > 4 && ( len * other ) < len * 4 ){
            System.out.println( "that spam." ); //if message is token or like it...
         
        }
