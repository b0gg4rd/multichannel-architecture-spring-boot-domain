package org.example.seed.event;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.UUID;

/**
 * Created by Ricardo Pina Arellano on 30/11/2016.
 */
@Data
@AllArgsConstructor
@XmlRootElement
public abstract class DeleteEvent {
    private UUID id;
}
