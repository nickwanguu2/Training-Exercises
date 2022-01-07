package com.company.interfaces;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Spork implements Spoon,Fork{
    @Getter
    @Setter
    private double length;
    @Getter
    @Setter
    private String material;

    @Override
    public void stabNoodles() {

    }

    @Override
    public void holdSoup() {

    }
}
