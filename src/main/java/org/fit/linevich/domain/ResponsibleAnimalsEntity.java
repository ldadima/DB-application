package org.fit.linevich.domain;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@Table(name = "responsible_animals", schema = "public", catalog = "bd_zoo")
@IdClass(ResponsibleAnimalsEntityPK.class)
public class ResponsibleAnimalsEntity {
    @Basic
    @Column(name = "date_begin", nullable = false)
    private Date dateBegin;
    @Basic
    @Column(name = "date_end", nullable = true)
    private Date dateEnd;
    @Id
    @ManyToOne
    @JoinColumn(name = "employer_id", referencedColumnName = "id", nullable = false, insertable = false,
            updatable = false)
    private EmployeeEntity employerId;
    @Id
    @ManyToOne
    @JoinColumn(name = "animal_id", referencedColumnName = "id", nullable = false, insertable = false,
            updatable = false)
    private AnimalEntity animalId;
}
