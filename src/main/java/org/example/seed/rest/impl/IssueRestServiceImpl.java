package org.example.seed.rest.impl;

import org.example.seed.event.issue.*;
import org.example.seed.rest.IssueRestService;
import org.example.seed.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/**
 * Created by Ricardo Pina Arellano on 13/12/2016.
 */

@RestController
public class IssueRestServiceImpl implements IssueRestService {

    @Autowired
    private IssueService issueService;

    @Override
    public CatalogIssueEvent requestAllIssues(final RequestAllIssuesEvents requestAllIssuesEvents) throws ExecutionException, InterruptedException {
        return this.issueService.requestAllIssues().get();
    }

    @Override
    public ResponseIssueEvent createIssue(final CreateIssueEvent createIssueEvent) throws ExecutionException, InterruptedException {
        return this.issueService.createIssue(createIssueEvent).get();
    }

    @Override
    public ResponseIssueEvent getIssue(final RequestIssueEvent requestIssueEvent) throws ExecutionException, InterruptedException {
        return this.issueService.requestIssue(requestIssueEvent).get();
    }

    @Override
    public ResponseIssueEvent updateIssue(final UpdateIssueEvent updateIssueEvent) throws ExecutionException, InterruptedException {
        return this.issueService.updateIssue(updateIssueEvent).get();
    }

    @Override
    public ResponseIssueEvent deleteIssue(final DeleteIssueEvent deleteIssueEvent) {
        return this.issueService.deleteIssue(deleteIssueEvent);
    }
}
