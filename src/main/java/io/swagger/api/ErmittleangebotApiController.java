package io.swagger.api;

import io.swagger.model.HanseaticServiceErmittlungsAnfrage;

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
public class ErmittleangebotApiController implements ErmittleangebotApi {



    public ResponseEntity<String> ermittleAnbgebotUsingPOST(@ApiParam(value = "anfrage" ,required=true )  @Valid @RequestBody HanseaticServiceErmittlungsAnfrage anfrage) {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
