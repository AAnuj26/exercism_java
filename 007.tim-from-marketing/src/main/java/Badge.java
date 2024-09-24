class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder badge = new StringBuilder();

        if(id != null ) {
            badge.append("[").append(id).append("] - ");            
        }
        
        badge.append(name).append(" - ");

        if(department == null) {
            badge.append("OWNER");
        } else {
            badge.append(department.toUpperCase());
        };

        return badge.toString();
    }
}
