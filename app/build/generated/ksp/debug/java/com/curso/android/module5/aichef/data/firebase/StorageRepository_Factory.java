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
public final class StorageRepository_Factory implements Factory<StorageRepository> {
  @Override
  public StorageRepository get() {
    return newInstance();
  }

  public static StorageRepository_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StorageRepository newInstance() {
    return new StorageRepository();
  }

  private static final class InstanceHolder {
    static final StorageRepository_Factory INSTANCE = new StorageRepository_Factory();
  }
}
