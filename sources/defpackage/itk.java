package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class itk implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ itk(Context context, String str, ayq ayqVar, Uri uri, oin oinVar, oip oipVar, int i) {
        this.$cid = i;
        this.a = context;
        this.d = str;
        this.f = ayqVar;
        this.e = uri;
        this.b = oinVar;
        this.c = oipVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, zwh] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() throws onr {
        String message = "";
        int i = this.$cid;
        byte[] bArr = null;
        int i2 = 0;
        if (i == 0) {
            anqm anqmVar = (anqm) ahng.v(this.b);
            Object obj = this.a;
            itq itqVar = (itq) obj;
            itqVar.e = anqmVar;
            List list = (List) ahng.v(this.c);
            iss issVar = itqVar.c;
            Object obj2 = this.d;
            if (issVar.a.getBoolean("SideloadedMigrationDebugInfo", false)) {
                taf.i(issVar.c.e(), MoreExecutors.directExecutor(), new ihw(15), new gsu(issVar, obj2, list, 20), null);
            }
            Object obj3 = this.f;
            Object obj4 = this.e;
            int i3 = 4;
            if (itqVar.e == anqm.MUSIC_LIBRARY_ITEM_VIEW_MODE_GRID_ITEMS) {
                Stream map = Collection.EL.stream(list).map(new hpm(obj, obj2, obj4, 6, null)).map(new itm(2));
                Collator collator = Collator.getInstance();
                collator.setStrength(0);
                itm itmVar = new itm(3);
                collator.getClass();
                Stream streamSorted = map.sorted(Comparator$CC.comparing(itmVar, new fui(collator, i3, bArr)));
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((java.util.Collection) streamSorted.collect(aghu.a));
                return itqVar.e(itqVar.f(arrayList, (Class) obj2, (apyu) obj3, new ito(obj, 0)), "Failed to create section list renderer with two row item renderer list");
            }
            Stream map2 = Collection.EL.stream(list).map(new hpm(obj, obj2, obj4, 5, null)).map(new itm(1));
            Collator collator2 = Collator.getInstance();
            collator2.setStrength(0);
            itm itmVar2 = new itm(0);
            collator2.getClass();
            Stream streamSorted2 = map2.sorted(Comparator$CC.comparing(itmVar2, new fui(collator2, i3, bArr)));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll((java.util.Collection) streamSorted2.collect(aghu.a));
            return itqVar.e(itqVar.f(arrayList2, (Class) obj2, (apyu) obj3, new itl(0)), "Failed to create section list renderer with two column item renderer list");
        }
        if (i == 1) {
            Optional optional = (Optional) ahng.v(this.e);
            aaqf aaqfVar = (aaqf) ahng.v(this.b);
            ilq ilqVar = new ilq(aaqfVar.b, aaqfVar.d.hw());
            ilqVar.n((aigj) this.c);
            ilqVar.a = (apji) this.f;
            abjw abjwVar = (abjw) this.a;
            agke agkeVar = abjwVar.a;
            ilqVar.b = ((hyz) agkeVar.get(abjwVar.b)).t();
            Stream map3 = Collection.EL.stream(agkeVar).map(new iaa(18));
            Collector collector = aghu.a;
            ilqVar.c = (agke) map3.collect(collector);
            ilqVar.d = (agke) Collection.EL.stream(this.d).map(new iaa(18)).collect(collector);
            if (optional.isPresent()) {
                ilqVar.e = aigj.v(((weh) optional.get()).c());
            }
            return ((wnh) aaqfVar.e).b(ilqVar, aaqfVar.c, null);
        }
        Object obj5 = this.c;
        Object obj6 = this.b;
        Object obj7 = this.e;
        Object obj8 = this.f;
        try {
            Uri uriBb = qnl.bb((Context) this.a, (String) this.d);
            InputStream inputStream = (InputStream) ((ayq) obj8).X((Uri) obj7, new qqs());
            try {
                OutputStream outputStream = (OutputStream) ((ayq) obj8).X(uriBb, new qqu());
                try {
                    agyi.a(inputStream, outputStream);
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th) {
                    if (outputStream == null) {
                        throw th;
                    }
                    try {
                        outputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                if (inputStream == null) {
                    throw th3;
                }
                try {
                    inputStream.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (qpy unused) {
            oin oinVar = (oin) obj6;
            oip oipVar = (oip) obj5;
            onb.e("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", oinVar.c, oipVar.d);
            message = String.format("System limit exceeded for file %s, group %s", oinVar.c, oipVar.d);
            i2 = 25;
        } catch (qqb unused2) {
            oin oinVar2 = (oin) obj6;
            oip oipVar2 = (oip) obj5;
            onb.e("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", oinVar2.c, oipVar2.d);
            message = String.format("Malformed blob Uri for file %s, group %s", oinVar2.c, oipVar2.d);
            i2 = 17;
        } catch (qqf e) {
            message = TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
            String str = ((oin) obj6).c;
            String str2 = ((oip) obj5).d;
            int i4 = onb.a;
            message = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(message));
            i2 = 24;
        } catch (IOException unused3) {
            oin oinVar3 = (oin) obj6;
            oip oipVar3 = (oip) obj5;
            onb.e("%s: Failed to copy to the blobstore after download for file %s, file group %s", "AndroidSharingUtil", oinVar3.c, oipVar3.d);
            message = String.format("Error while copying file %s, group %s, to the shared blob storage", oinVar3.c, oipVar3.d);
            i2 = 22;
        }
        if (i2 == 0) {
            return aher.a;
        }
        throw new onr(i2, message);
    }

    public /* synthetic */ itk(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, aigj aigjVar, apji apjiVar, abjw abjwVar, List list, int i) {
        this.$cid = i;
        this.e = listenableFuture;
        this.b = listenableFuture2;
        this.c = aigjVar;
        this.f = apjiVar;
        this.a = abjwVar;
        this.d = list;
    }

    public /* synthetic */ itk(itq itqVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, Class cls, agkj agkjVar, apyu apyuVar, int i) {
        this.$cid = i;
        this.a = itqVar;
        this.b = listenableFuture;
        this.c = listenableFuture2;
        this.d = cls;
        this.e = agkjVar;
        this.f = apyuVar;
    }
}
