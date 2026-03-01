package com.curso.android.module5.aichef.data.firebase;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class AuthRepository_Factory implements Factory<AuthRepository> {
  @Override
  public AuthRepository get() {
    return newInstance();
  }

  public static AuthRepository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AuthRepository newInstance() {
    return new AuthRepository();
  }

  private static final class InstanceHolder {
    static final AuthRepository_Factory INSTANCE = new AuthRepository_Factory();
  }
}
