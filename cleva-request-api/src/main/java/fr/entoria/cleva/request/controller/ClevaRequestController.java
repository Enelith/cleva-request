package fr.entoria.cleva.request.controller;

import java.util.Arrays;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;
import fr.entoria.cleva.request.business.IClevaFPolicesBusiness;
import fr.entoria.cleva.request.response.ClevaRequestApiResponse;

@RestController
@RequestMapping("/")
//@CrossOrigin
public class ClevaRequestController {
    private static Logger logger = (Logger) LoggerFactory.getLogger(ClevaRequestController.class);

    @Value("${build.version}")
    private String version;

    @Autowired
    IClevaFPolicesBusiness clevaFPolicesBusiness;

    @GetMapping(path = "version")
    public ResponseEntity<?> version() {
	logger.info("version path called");

	ClevaRequestApiResponse response = new ClevaRequestApiResponse();
	response.setCode(HttpStatus.OK);
	response.setResult(version);

	return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(path = "retrievePolicesByPoliciesNumber/{listId}")
    public ResponseEntity<?> retrievePolicesByPoliciesNumber(@PathVariable("listId") String sListId) {
	logger.info("- Retrieve Policies from Cleva");
	
	ClevaRequestApiResponse response = new ClevaRequestApiResponse();
	response.setCode(HttpStatus.OK);
	response.setResult(clevaFPolicesBusiness.retrievePolicesByPoliciesNumber(Arrays.asList(sListId.split(","))));

	return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(path = "getPolicesByPoliciesNumber")
    public ResponseEntity<?> getPolicesByPoliciesNumber(@RequestParam(name="listId") String sListId) {
	logger.info("- Get Policies from Cleva");
	
	ClevaRequestApiResponse response = new ClevaRequestApiResponse();
	response.setCode(HttpStatus.OK);
	response.setResult(clevaFPolicesBusiness.retrievePolicesByPoliciesNumber(Arrays.asList(sListId.split(","))));

	return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
