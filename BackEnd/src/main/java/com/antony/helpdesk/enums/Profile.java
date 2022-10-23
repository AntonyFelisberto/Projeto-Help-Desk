package com.antony.helpdesk.enums;

public enum Profile {

    ADMIN(0, "ROLE_ADMIN"),
    CLIENTE(1, "ROLE_CLIENTE"),
    TECNICO(2, "ROLE_TECNICO");

    private Integer id;
    private String description;


    private Profile(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public static Profile toEnum(Integer id){
        if(id == null){
            return null;
        }

        for (Profile perfil : Profile.values()) {
            if(id.equals(perfil.getId())){
                return perfil;
            }
        }

        throw new IllegalArgumentException("Perfil invalido");
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
