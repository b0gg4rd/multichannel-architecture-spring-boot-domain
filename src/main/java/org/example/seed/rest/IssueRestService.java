package org.example.seed.rest;

import org.example.seed.event.issue.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.concurrent.ExecutionException;

/**
 * Created by Ricardo Pina Arellano on 13/12/2016.
 */

@RequestMapping(path = "/issues", method = RequestMethod.POST,
        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
)
public interface IssueRestService {

    @RequestMapping(path = "/requestAll")
    CatalogIssueEvent requestAllIssues(final RequestAllIssuesEvents requestAllIssuesEvents) throws ExecutionException, InterruptedException;

    @RequestMapping(path = "/createIssue")
    ResponseIssueEvent createIssue(final CreateIssueEvent createIssueEvent) throws ExecutionException, InterruptedException;

    @RequestMapping(path = "/requestIssue")
    ResponseIssueEvent getIssue(final RequestIssueEvent requestIssueEvent) throws ExecutionException, InterruptedException;

    @RequestMapping(path = "/updateIssue")
    ResponseIssueEvent updateIssue(final UpdateIssueEvent updateIssueEvent) throws ExecutionException, InterruptedException;

    @RequestMapping(path = "/deleteIssue")
    ResponseIssueEvent deleteIssue(final DeleteIssueEvent deleteIssueEvent);
}
