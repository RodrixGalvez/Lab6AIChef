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
public final class FirestoreRepository_Factory implements Factory<FirestoreRepository> {
  @Override
  public FirestoreRepository get() {
    return newInstance();
  }

  public static FirestoreRepository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirestoreRepository newInstance() {
    return new FirestoreRepository();
  }

  private static final class InstanceHolder {
    static final FirestoreRepository_Factory INSTANCE = new FirestoreRepository_Factory();
  }
}
