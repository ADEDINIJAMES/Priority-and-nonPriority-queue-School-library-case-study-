package org.example.schoolMangement.service;

import org.example.schoolMangement.exceptions.BookNotFoundException;
import org.example.schoolMangement.exceptions.NoRoleException;

@FunctionalInterface
public interface LibraryImplUsingFunctionalIn<B> {
  void function (B b) throws BookNotFoundException, NoRoleException;

}
