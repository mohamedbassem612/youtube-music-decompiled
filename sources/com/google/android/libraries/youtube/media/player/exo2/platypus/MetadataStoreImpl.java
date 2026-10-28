package com.google.android.libraries.youtube.media.player.exo2.platypus;

import com.google.android.libraries.youtube.media.interfaces.MetadataStore;
import com.google.android.libraries.youtube.media.interfaces.MetadataStoreCallbacks;
import defpackage.agek;
import defpackage.aigj;
import defpackage.aihf;
import defpackage.aiip;
import defpackage.atpl;
import defpackage.tae;
import defpackage.taf;
import defpackage.tpq;
import defpackage.zik;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class MetadataStoreImpl extends MetadataStore {
    private final tpq a;

    public MetadataStoreImpl(tpq tpqVar) {
        this.a = tpqVar;
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MetadataStore
    public final void readDataAsync(final String str, final MetadataStoreCallbacks metadataStoreCallbacks) {
        if (metadataStoreCallbacks != null) {
            taf.g(this.a.a(), new tae() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.MetadataStoreImpl$$ExternalSyntheticLambda1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.tae, defpackage.twi
                public final void a(Object obj) {
                    String str2 = str;
                    aigj aigjVar = aigj.d;
                    str2.getClass();
                    aigj aigjVar2 = (aigj) ((atpl) obj).s.get(str2);
                    MetadataStoreCallbacks metadataStoreCallbacks2 = metadataStoreCallbacks;
                    if (aigjVar2 != null) {
                        aigjVar = aigjVar2;
                    }
                    byte[] bArrG = aigjVar.G();
                    synchronized (zik.class) {
                        metadataStoreCallbacks2.onReadMetadataComplete(str2, bArrG);
                    }
                }
            });
        }
    }

    @Override // com.google.android.libraries.youtube.media.interfaces.MetadataStore
    public final void writeData(final String str, final byte[] bArr) {
        this.a.b(new agek() { // from class: com.google.android.libraries.youtube.media.player.exo2.platypus.MetadataStoreImpl$$ExternalSyntheticLambda0
            @Override // defpackage.agek
            public final Object apply(Object obj) {
                aihf builder = ((atpl) obj).toBuilder();
                String str2 = str;
                aigj aigjVarV = aigj.v(bArr);
                str2.getClass();
                aigjVarV.getClass();
                builder.copyOnWrite();
                atpl atplVar = (atpl) builder.instance;
                aiip aiipVar = atplVar.s;
                if (!aiipVar.b) {
                    atplVar.s = aiipVar.a();
                }
                atplVar.s.put(str2, aigjVarV);
                return (atpl) builder.build();
            }
        });
    }
}
