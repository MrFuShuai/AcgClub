package com.rabtman.acgnews.di.module;

import com.rabtman.acgnews.mvp.contract.AcgNewsContract;
import com.rabtman.acgnews.mvp.model.AcgNewsModel;
import com.rabtman.common.di.scope.FragmentScope;
import dagger.Module;
import dagger.Provides;

/**
 * @author Rabtman
 */
@Module
public class AcgNewsItemModule {

  private AcgNewsContract.View view;

  public AcgNewsItemModule(AcgNewsContract.View view) {
    this.view = view;
  }

  @FragmentScope
  @Provides
  AcgNewsContract.View providerAcgNewsView() {
    return this.view;
  }

  @FragmentScope
  @Provides
  AcgNewsContract.Model providerAcgNewsModel(AcgNewsModel model) {
    return model;
  }
}
