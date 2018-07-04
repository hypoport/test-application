package io.swagger.api;

import java.util.Map;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-13T15:17:19.449Z")

@Controller
public class ErrorApiController implements ErrorApi {



    public ResponseEntity<Map<String, Object>> errorUsingDELETE() {
        // do some magic!
        return new ResponseEntity<Map<String, Object>>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, Object>> errorUsingGET() {
        // do some magic!
        return new ResponseEntity<Map<String, Object>>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, Object>> errorUsingHEAD() {
        // do some magic!
        return new ResponseEntity<Map<String, Object>>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, Object>> errorUsingOPTIONS() {
        // do some magic!
        return new ResponseEntity<Map<String, Object>>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, Object>> errorUsingPATCH() {
        // do some magic!
        return new ResponseEntity<Map<String, Object>>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, Object>> errorUsingPOST() {
        // do some magic!
        return new ResponseEntity<Map<String, Object>>(HttpStatus.OK);
    }

    public ResponseEntity<Map<String, Object>> errorUsingPUT() {
        // do some magic!
        return new ResponseEntity<Map<String, Object>>(HttpStatus.OK);
    }

}
