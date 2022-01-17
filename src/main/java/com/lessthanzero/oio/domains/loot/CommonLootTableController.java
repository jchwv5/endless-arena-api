package com.lessthanzero.oio.domains.loot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.lessthanzero.oio.constants.Paths.COMMON_LOOT_TABLE_PATH;

@RestController
@RequestMapping(value = COMMON_LOOT_TABLE_PATH)
public class CommonLootTableController {
    Logger logger = LogManager.getLogger(com.lessthanzero.oio.domains.loot.CommonLootTableController.class);

    @Autowired
    private CommonLootTableService commonLootTableService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<List<CommonLootTable>> getCommonLootTableByMonsterId(@PathVariable Long id)
            throws Exception {
        logger.info("Request received for Get Common Loot Table by Monster ID: " + id);
        return new ResponseEntity<>(commonLootTableService.getCommonLootTableByMonsterId(id), HttpStatus.OK);
    }
}
