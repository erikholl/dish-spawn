package io.eho.dishspawn.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

// todo: FIX
@Getter @Setter
@Entity
@Table(name = "love")
public class Love {

    @CreationTimestamp
    @Column(name="timestamp_created")
    @Setter(AccessLevel.NONE)
    private Timestamp timestampCreated;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    @Column(name = "love_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "visual_id") // results in recipe id in like table
    private Visual visual;

    @ManyToOne
    @JoinColumn(name = "chef_id") // results in chef id (who gave the like) like table
    private Chef chef;

    // toString
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Love id: " + this.id);
        sb.append(": ");
        sb.append("by " + this.chef.getUserName() + " ");
        sb.append("for visual " + this.visual.getFileLocation());
        sb.append("with recipe: " + this.visual.getRecipe().getName());

        return sb.toString();

    }


    // equals & hash

}
