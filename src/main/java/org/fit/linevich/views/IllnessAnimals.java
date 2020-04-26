package org.fit.linevich.views;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.Objects;

@Data
public class IllnessAnimals {
    @NotNull
    private int animalId;
    @NotNull
    private int illnessId;
    @NotNull
    private Date dateBegin;
    private Date dateEnd;
}
