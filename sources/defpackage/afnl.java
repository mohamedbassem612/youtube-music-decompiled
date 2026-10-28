package defpackage;

import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.common.util.concurrent.ListenableFuture;
import internal.org.jni_zero.JniZero;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afnl implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;

    public /* synthetic */ afnl(afnp afnpVar, boolean z, int i) {
        this.$cid = i;
        this.b = afnpVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        File fileA;
        int i = this.$cid;
        if (i == 0) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            boolean zBooleanValue = bool.booleanValue();
            Object obj2 = this.b;
            if (zBooleanValue) {
                return ((afnp) obj2).c();
            }
            afnp afnpVar = (afnp) obj2;
            Map map = afnpVar.j;
            Object obj3 = ((aupo) afnpVar.g).b;
            obj3.getClass();
            Iterable iterable = (Iterable) obj3;
            ArrayList arrayList = new ArrayList(atqq.N(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(new afni((afna) it.next(), 3));
            }
            return afnpVar.l.h(new ial(obj2, map, this.a, 2), aguu.V(arrayList));
        }
        if (i == 1) {
            if (obj instanceof PaintUnit) {
                PaintUnit paintUnit = (PaintUnit) obj;
                if (paintUnit.i() && (!this.a || paintUnit.r() == null)) {
                    this.b.add(paintUnit);
                }
            }
            return awmy.a;
        }
        Boolean bool2 = (Boolean) obj;
        bool2.getClass();
        if (!bool2.booleanValue()) {
            return aher.a;
        }
        boolean z = this.a;
        afnp afnpVar2 = (afnp) this.b;
        int i2 = afnpVar2.d;
        if (z && (fileA = afnpVar2.a()) != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(fileA, "rw");
                try {
                    randomAccessFile.writeInt(i2);
                    JniZero.l(randomAccessFile, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        JniZero.l(randomAccessFile, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                ((agrc) ((agrc) afnpVar2.h.c()).j(e).k("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "writePackageVersionToFile", 563, "StartupAfterPackageReplacedWithRetryRunner.kt")).t("Failed to write package version to file");
            }
        }
        omj omjVarD = afnpVar2.d();
        omr omrVar = new omr();
        omrVar.i("INSERT INTO AllListenersSucceededVersionTable (version_code) VALUES (?)");
        omrVar.j(Long.valueOf(i2));
        ListenableFuture listenableFutureAa = omjVarD.aa(omrVar.p());
        listenableFutureAa.getClass();
        return listenableFutureAa;
    }

    public /* synthetic */ afnl(boolean z, List list, int i) {
        this.$cid = i;
        this.a = z;
        this.b = list;
    }
}
