package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tht extends tft {
    protected final awmd a;
    protected final thw b;
    protected final toh c;
    public final vxz d;
    private final boolean e;
    private final int f;
    private final int g;

    public tht(thu thuVar, vxz vxzVar) {
        this.a = thuVar.a;
        tfu tfuVar = thuVar.c;
        this.e = tfuVar.e;
        this.f = tfuVar.b;
        this.g = tfuVar.c;
        if (!thuVar.e) {
            synchronized (thuVar) {
                if (!thuVar.e) {
                    thuVar.d = thuVar.c.d ? new toh() : null;
                    thuVar.e = true;
                }
            }
        }
        this.c = thuVar.d;
        this.b = (thw) thuVar.b.io();
        this.d = vxzVar;
    }

    @Override // defpackage.tft
    public final tgo a(tgf tgfVar) throws IOException {
        String str = tgfVar.a;
        if (this.c != null) {
            toh.a(str);
        }
        thx thxVar = new thx(this.f, this.g);
        thq thqVar = new thq(thxVar, this.e, this);
        UrlRequest.Builder builderNewUrlRequestBuilder = ((CronetEngine) this.a.io()).newUrlRequestBuilder(str, thqVar, thxVar);
        builderNewUrlRequestBuilder.setHttpMethod(tym.aF(tgfVar.f));
        tfz tfzVar = tgfVar.b;
        thw thwVar = this.b;
        Collection<Map.Entry> collection = tfzVar.b;
        ArrayList arrayList = new ArrayList(collection.size());
        for (Map.Entry entry : collection) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), (String) entry.getValue()));
        }
        thwVar.b(builderNewUrlRequestBuilder, DesugarCollections.unmodifiableList(arrayList));
        tgd tgdVar = tgfVar.c;
        if (tgdVar != null) {
            ByteBuffer byteBufferB = tgdVar.b();
            builderNewUrlRequestBuilder.setUploadDataProvider(byteBufferB != null ? UploadDataProviders.create(byteBufferB) : new thr(tgdVar), thxVar);
        }
        builderNewUrlRequestBuilder.setPriority(tgfVar.d);
        if (this.d.m(14, 45627566L)) {
            Optional optional = tgfVar.e;
            if (optional.isPresent()) {
                builderNewUrlRequestBuilder.setTrafficStatsTag(((tok) optional.get()).az);
            } else {
                builderNewUrlRequestBuilder.setTrafficStatsTag(tok.CRONET_HTTP_CLIENT.az);
            }
        }
        UrlRequest urlRequestBuild = builderNewUrlRequestBuilder.build();
        urlRequestBuild.start();
        if (!thxVar.c) {
            thxVar.c(urlRequestBuild, thxVar.a + thxVar.b);
        }
        while (!thxVar.c) {
            thxVar.c(urlRequestBuild, thxVar.b);
        }
        thqVar.a();
        thqVar.a();
        if (thqVar.b) {
            return (tgo) thqVar.c;
        }
        throw new IOException();
    }
}
