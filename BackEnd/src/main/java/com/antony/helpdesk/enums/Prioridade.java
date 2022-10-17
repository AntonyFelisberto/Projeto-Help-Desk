package com.antony.helpdesk.enums;

public enum Prioridade {

    BAIXA(0,"BAIXA"),
    MEDIA(1,"MEDIA"),
    ALTA(2,"ALTA");

    private Integer id;
    private String description;

    private Prioridade(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public static Prioridade getEnum(Integer id){
        if(id == null){
            return null;
        }
        
        for(Prioridade status : Prioridade.values()){
            if(id.equals(status.getId())){
                return status;
            }
        }

        throw new IllegalArgumentException("Prioridade invalida");
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
