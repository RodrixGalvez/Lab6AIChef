package com.curso.android.module5.aichef.data.remote;

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
public final class AiLogicDataSource_Factory implements Factory<AiLogicDataSource> {
  @Override
  public AiLogicDataSource get() {
    return newInstance();
  }

  public static AiLogicDataSource_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AiLogicDataSource newInstance() {
    return new AiLogicDataSource();
  }

  private static final class InstanceHolder {
    static final AiLogicDataSource_Factory INSTANCE = new AiLogicDataSource_Factory();
  }
}
