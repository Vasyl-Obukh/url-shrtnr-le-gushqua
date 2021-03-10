package edu.kpi.testcourse.bigtable;

import java.util.Map;
import java.util.Set;

/**
 * DAO for invalid JWT tokens.
 */
public interface TokenDao {

  void add(String email, String invalidToken);

  void remove(String email, String invalidToken);

  Set<String> get(String email);

  Map<String, Set<String>> getAll();

  String toJson();

  void fromJson();

  String getFileName();

}
