/*
 * Created on 15.11.2012 - 12:08:02 
 * 
 * Copyright(c) 2012 Thomas Struller-Baumann. All Rights Reserved.
 * This software is the proprietary information of Thomas Struller-Baumann.
 */
package de.strullerbaumann.visualee.resources;

import de.strullerbaumann.visualee.cdi.CDIDependency;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas Struller-Baumann <thomas at struller-baumann.de>
 */
public class JavaFile {

   private File javaFile;
   private List<CDIDependency> injected;
   private int id;   // for D3.js, links need ids's form the nodes (id's start with 0)
   private int group;   // Nodes form the same package have the same group-number
   private String packagePath;
   private String sourceCode;

   public JavaFile(File javaClassFile) {
      this.javaFile = javaClassFile;
      injected = new ArrayList<>();
      sourceCode = "";
   }

   public File getJavaFile() {
      return javaFile;
   }

   public void setJavaFile(File classFile) {
      this.javaFile = classFile;
   }

   public List<CDIDependency> getInjected() {
      return injected;
   }

   public void setInjected(List<CDIDependency> injected) {
      this.injected = injected;
   }

   @Override
   public String toString() {
      return this.getJavaFile().getName().substring(0, this.getJavaFile().getName().indexOf(".java"));
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getGroup() {
      return group;
   }

   public void setGroup(int group) {
      this.group = group;
   }

   public String getPackagePath() {
      return packagePath;
   }

   public void setPackagePath(String packagePath) {
      this.packagePath = packagePath;
   }

   public String getSourceCode() {
      return sourceCode;
   }

   public void setSourceCode(String sourceCode) {
      this.sourceCode = sourceCode;
   }
}
