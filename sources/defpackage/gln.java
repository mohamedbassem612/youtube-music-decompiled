package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import j$.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gln implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gln(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v25, types: [avls, java.lang.Object] */
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        ImageView imageView;
        apji apjiVar;
        int i = 10;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                String str = (String) obj;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                Object obj2 = this.a;
                if (zIsEmpty) {
                    View view = ((gls) obj2).n;
                    if (view != null) {
                        view.setVisibility(8);
                        return;
                    }
                    return;
                }
                TextView textView = ((gls) obj2).m;
                if (textView != null) {
                    textView.setText(str);
                    return;
                }
                return;
            case 1:
                String str2 = (String) obj;
                TextView textView2 = ((gls) this.a).l;
                if (textView2 != null) {
                    textView2.setText(ahno.Z(str2));
                    return;
                }
                return;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null || (imageView = ((gls) this.a).k) == null) {
                    return;
                }
                imageView.setImageBitmap(bitmap);
                return;
            case 3:
                ((gsw) this.a).h.g();
                return;
            case 4:
                alyp alypVar = (alyp) obj;
                gty gtyVar = (gty) this.a;
                apji apjiVar2 = null;
                gtyVar.b.hB().d(new xgj(alypVar.e, (amud) null));
                if ((alypVar.b & 2) != 0) {
                    apjiVar = alypVar.d;
                    if (apjiVar == null) {
                        apjiVar = apji.a;
                    }
                } else {
                    apjiVar = null;
                }
                ajwq ajwqVar = (ajwq) aavv.s(apjiVar, ajwr.a);
                if ((alypVar.b & 2) != 0 && (apjiVar2 = alypVar.d) == null) {
                    apjiVar2 = apji.a;
                }
                aqgy aqgyVar = (aqgy) aavv.s(apjiVar2, aqgz.a);
                if (ajwqVar != null && (ajwqVar.b & 1) != 0) {
                    vxe vxeVar = gtyVar.c;
                    ajwo ajwoVar = ajwqVar.c;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                    vxeVar.a(ajwoVar);
                    return;
                }
                if (aqgyVar == null || (aqgyVar.b & 16) == 0) {
                    return;
                }
                ivu ivuVar = gtyVar.a;
                aqgx aqgxVar = aqgyVar.c;
                if (aqgxVar == null) {
                    aqgxVar = aqgx.a;
                }
                ivuVar.e(aqgxVar, 1);
                return;
            case 5:
                taf.j(((ayq) ((iql) obj).a.io()).j(new uzg(this.a, i2)), new ihw(11));
                return;
            case 6:
                ((gwl) this.a).a((alvy) obj);
                return;
            case 7:
                ((Bundle) this.a).putString("restricted_mode", Boolean.toString(((Boolean) obj).booleanValue()));
                return;
            case 8:
                ?? r5 = this.a;
                r5.c((aldz) obj);
                r5.a();
                return;
            case 9:
                ((hfl) this.a).a((alrk) obj);
                return;
            case 10:
                ((hfq) this.a).a((alrm) obj);
                return;
            case 11:
                ((hfd) this.a).a((alri) obj);
                return;
            case 12:
                Boolean bool = (Boolean) obj;
                hhr.h((hjn) this.a, bool != null ? bool.booleanValue() : false);
                return;
            case 13:
                ((his) this.a).a((amzs) obj);
                return;
            case 14:
                ((hit) this.a).f((amzv) obj);
                return;
            case 15:
                ((hiu) this.a).a((anab) obj);
                return;
            case 16:
                aill aillVar = (aill) obj;
                Object obj3 = this.a;
                hja hjaVar = (hja) obj3;
                hjaVar.d.writeLock().lock();
                try {
                    ((hja) obj3).a = aillVar;
                    ReentrantReadWriteLock reentrantReadWriteLock = hjaVar.d;
                    reentrantReadWriteLock.writeLock().unlock();
                    hjaVar.b = false;
                    if (hjaVar.a == null) {
                        hjaVar.c();
                        return;
                    }
                    reentrantReadWriteLock.writeLock().lock();
                    while (true) {
                        try {
                            Queue queue = ((hja) obj3).e;
                            if (queue.isEmpty()) {
                                hjaVar.d.writeLock().unlock();
                                hjaVar.d(3);
                                return;
                            }
                            ((hja) obj3).a = (aill) a$$ExternalSyntheticApiModelOutline0.m11m(queue.remove()).apply(((hja) obj3).a);
                        } catch (Throwable th) {
                            hjaVar.d.writeLock().unlock();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    hjaVar.d.writeLock().unlock();
                    hjaVar.b = false;
                    throw th2;
                }
                break;
            case 17:
                ((hja) this.a).c = false;
                return;
            case 18:
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                Object obj4 = this.a;
                jio jioVarE = jin.e();
                hmn hmnVar = ((hmm) obj4).j;
                ((jik) jioVarE).k(hmnVar.a.getText(R.string.manual_sync_offline_network_unavailable));
                hmnVar.e.d(jioVarE.b());
                return;
            case 19:
                Collection.EL.stream((List) obj).filter(new gqk(i)).map(new bwa(19)).forEach(new gmk(this.a, 12));
                return;
            default:
                Collection.EL.stream((List) obj).filter(new gqk(i)).map(new bwa(20)).forEach(new gmk(this.a, 13));
                return;
        }
    }
}
