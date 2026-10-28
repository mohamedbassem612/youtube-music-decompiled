package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import com.google.research.xeno.effect.AssetDownloader;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uyj implements AssetDownloader {
    public final HashMap a = new HashMap();
    public final String b;
    private final Context c;
    private final Optional d;
    private final aczl e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, zwa] */
    public uyj(ahgb ahgbVar, Context context, Optional optional) {
        vzq vzqVar = new vzq();
        vzqVar.a = 5;
        vzqVar.b = 10;
        vzqVar.c = (byte) 3;
        urh urhVar = new urh(vzqVar, 7);
        if (true == optional.isPresent()) {
            ((vzq) urhVar.a).a(optional.get());
        }
        if (vzqVar.c != 3) {
            StringBuilder sb = new StringBuilder();
            if ((vzqVar.c & 1) == 0) {
                sb.append(" maxPermits");
            }
            if ((vzqVar.c & 2) == 0) {
                sb.append(" maxWaitQueueSize");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        vzu vzuVar = new vzu(vzqVar.a, vzqVar.b, (Optional) vzqVar.d);
        zpw zpwVar = (zpw) ahgbVar.d.io();
        zpwVar.getClass();
        Executor executor = (Executor) ahgbVar.e.io();
        executor.getClass();
        hed hedVar = (hed) ahgbVar.b.io();
        hedVar.getClass();
        tld tldVar = (tld) ahgbVar.c.io();
        tldVar.getClass();
        zwn zwnVar = (zwn) ahgbVar.a.io();
        zwnVar.getClass();
        this.e = new aczl(zpwVar, executor, hedVar, tldVar, zwnVar, vzuVar);
        this.c = context;
        this.b = (String) (true != optional.isPresent() ? optional : Optional.ofNullable(optional.get().k())).orElse("");
        this.d = optional;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, zwa] */
    public final String a(String str) {
        tyt tytVar = new tyt(Uri.parse(str));
        urh urhVar = new urh(tytVar, 8);
        Optional optional = this.d;
        if (true == optional.isPresent()) {
            ?? r3 = optional.get();
            Object obj = urhVar.a;
            if (r3.d()) {
                ((tyt) obj).e("pageId", r3.l());
            }
        }
        return tytVar.toString();
    }

    @Override // com.google.research.xeno.effect.AssetDownloader
    public final void downloadAsset(String str, AssetDownloader.DownloadCallback downloadCallback) {
        aigj aigjVar;
        aigj aigjVar2;
        aigj aigjVar3;
        aigj aigjVar4;
        File fileCreateTempFile;
        int i;
        ListenableFuture listenableFuture;
        HashMap map = this.a;
        String strA = a(str);
        uyi uyiVar = (uyi) map.get(strA);
        Uri uriF = null;
        if (uyiVar == null) {
            aigjVar2 = null;
            aigjVar = null;
        } else {
            aigjVar = uyiVar.a;
            aigjVar2 = uyiVar.b;
        }
        if ((aigjVar == null || !aigjVar.E()) && (aigjVar2 == null || !aigjVar2.E())) {
            aigjVar3 = aigjVar2;
            aigjVar4 = aigjVar;
        } else {
            aigjVar4 = null;
            aigjVar3 = null;
        }
        try {
            fileCreateTempFile = File.createTempFile("DataPushAssetDownloaderTempFile", null, this.c.getCacheDir());
            try {
                fileCreateTempFile.deleteOnExit();
            } catch (IOException e) {
                e = e;
                zvp.a(zvn.b, zvm.y, "[ShortsCreation][Android][Effect]Failed to createTempFile, exception = ".concat(String.valueOf(e.getMessage())));
            }
        } catch (IOException e2) {
            e = e2;
            fileCreateTempFile = null;
        }
        if (fileCreateTempFile != null) {
            Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
            agjz agjzVar = new agjz(4);
            builderPath.path(fileCreateTempFile.getPath());
            uriF = rmp.F(builderPath, agjzVar);
        }
        Uri uri = uriF;
        if (uri == null) {
            zvp.a(zvn.b, zvm.y, "[ShortsCreation][Android][Effect]Failed to download effect asset from ".concat(String.valueOf(strA)));
            return;
        }
        aczl aczlVar = this.e;
        waq waqVar = new waq(aczlVar, strA, uri, aigjVar4, aigjVar3, 0);
        Object obj = aczlVar.b;
        wao waoVar = (wao) obj;
        synchronized (waoVar.f) {
            int i2 = ((wao) obj).a;
            i = 0;
            if (i2 > 0) {
                ((wao) obj).a = i2 - 1;
                listenableFuture = aher.a;
                ((aghi) ((wao) obj).c).f(listenableFuture, 1);
            } else {
                ArrayDeque arrayDeque = ((wao) obj).b;
                if (arrayDeque.size() >= ((wao) obj).d) {
                    ((SettableFuture) arrayDeque.removeFirst()).cancel(false);
                }
                SettableFuture settableFutureCreate = SettableFuture.create();
                arrayDeque.addLast(settableFutureCreate);
                listenableFuture = settableFutureCreate;
            }
        }
        ListenableFuture listenableFutureB = ahng.h(listenableFuture).b(afwl.c(new wan(listenableFuture, waqVar, i)), waoVar.e);
        listenableFutureB.addListener(new uqd(obj, listenableFuture, 13), MoreExecutors.directExecutor());
        ahng.x(listenableFutureB, afwl.g(new hqd(downloadCallback, uri, str, 5)), MoreExecutors.directExecutor());
    }
}
