package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.apps.youtube.proto.MediaHeaderOuterClass$MediaHeader;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DefaultOnesieStorePusher$$ExternalSyntheticLambda4 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (int) (((MediaHeaderOuterClass$MediaHeader) obj).g - ((MediaHeaderOuterClass$MediaHeader) obj2).g);
    }
}
