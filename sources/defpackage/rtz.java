package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rtz {
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Map b = new ConcurrentHashMap();
    public final List c = DesugarCollections.synchronizedList(new ArrayList());
    public final Map d = new ConcurrentHashMap();
    public volatile boolean e = false;
    public volatile boolean f = false;
    public volatile ListenableFuture g;
    public volatile List h;
    public volatile tld i;
}
