/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.fresco.vito.view;

import com.facebook.fresco.vito.provider.FrescoVitoProvider;

public class LazyVitoViewImpl2 extends LazyVitoViewImpl {

  public LazyVitoViewImpl2(FrescoVitoProvider.Implementation provider) {
    super(provider);
  }

  @Override
  protected VitoView.Implementation create(FrescoVitoProvider.Implementation provider) {
    return new VitoViewImpl2(provider.getController(), provider.getImagePipeline());
  }
}
