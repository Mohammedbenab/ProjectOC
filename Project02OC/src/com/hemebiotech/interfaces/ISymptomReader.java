package com.hemebiotech.interfaces;

import java.io.IOException;
import java.util.List;

/**
 * 
 * @author Benabdallah 
 * @version 1.0
 * 
 * ISymptomReader is interface for listing of all Symptoms obtained from a data source
 *
 */

public interface ISymptomReader {

	List<String> getSymptoms () throws IOException;
}
