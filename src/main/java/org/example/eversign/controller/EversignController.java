package org.example.eversign.controller;
import org.example.eversign.service.EversignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/documents")
public class EversignController
{
@Autowired
    private final EversignService eversignService;

    public EversignController(EversignService eversignService)
    {
        this.eversignService = eversignService;
    }

    @GetMapping("/{documentId}")
    public ResponseEntity<String> getDocument(@PathVariable String documentId,
                                              @RequestParam String type)
    {
        String result = eversignService.getDocument(documentId, type);
        return ResponseEntity.ok(result);
    }
}