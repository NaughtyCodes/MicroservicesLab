package com.naughtycodes.ms00.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class MovieRatings {
    private Integer id;
    private String name;
    private Integer ratings;

}
