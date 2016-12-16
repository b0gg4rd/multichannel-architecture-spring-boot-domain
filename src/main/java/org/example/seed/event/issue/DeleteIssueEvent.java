package org.example.seed.event.issue;

import lombok.Builder;
import org.example.seed.event.DeleteEvent;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.UUID;

/**
 * Created by Ricardo Pina Arellano on 30/11/2016.
 */
@XmlRootElement
public class DeleteIssueEvent extends DeleteEvent {

    @Builder
    public DeleteIssueEvent(final UUID id) {
        super(id);
    }
}
