package com.curso.android.module5.aichef.ui.viewmodel;

import com.curso.android.module5.aichef.data.firebase.IAuthRepository;
import com.curso.android.module5.aichef.data.firebase.IFirestoreRepository;
import com.curso.android.module5.aichef.data.firebase.IStorageRepository;
import com.curso.android.module5.aichef.data.remote.IAiLogicDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
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
public final class ChefViewModel_Factory implements Factory<ChefViewModel> {
  private final Provider<IAuthRepository> authRepositoryProvider;

  private final Provider<IFirestoreRepository> firestoreRepositoryProvider;

  private final Provider<IStorageRepository> storageRepositoryProvider;

  private final Provider<IAiLogicDataSource> aiLogicDataSourceProvider;

  private ChefViewModel_Factory(Provider<IAuthRepository> authRepositoryProvider,
      Provider<IFirestoreRepository> firestoreRepositoryProvider,
      Provider<IStorageRepository> storageRepositoryProvider,
      Provider<IAiLogicDataSource> aiLogicDataSourceProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.firestoreRepositoryProvider = firestoreRepositoryProvider;
    this.storageRepositoryProvider = storageRepositoryProvider;
    this.aiLogicDataSourceProvider = aiLogicDataSourceProvider;
  }

  @Override
  public ChefViewModel get() {
    return newInstance(authRepositoryProvider.get(), firestoreRepositoryProvider.get(), storageRepositoryProvider.get(), aiLogicDataSourceProvider.get());
  }

  public static ChefViewModel_Factory create(Provider<IAuthRepository> authRepositoryProvider,
      Provider<IFirestoreRepository> firestoreRepositoryProvider,
      Provider<IStorageRepository> storageRepositoryProvider,
      Provider<IAiLogicDataSource> aiLogicDataSourceProvider) {
    return new ChefViewModel_Factory(authRepositoryProvider, firestoreRepositoryProvider, storageRepositoryProvider, aiLogicDataSourceProvider);
  }

  public static ChefViewModel newInstance(IAuthRepository authRepository,
      IFirestoreRepository firestoreRepository, IStorageRepository storageRepository,
      IAiLogicDataSource aiLogicDataSource) {
    return new ChefViewModel(authRepository, firestoreRepository, storageRepository, aiLogicDataSource);
  }
}
