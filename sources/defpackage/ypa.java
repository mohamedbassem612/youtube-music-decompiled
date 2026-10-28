package defpackage;

import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.interfaces.QoeErrorDetail;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ypa implements tmd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ypa(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.tmd
    public final void a(int i) {
        QoeError qoeError;
        int i2 = this.$cid;
        Object obj = this.a;
        if (i2 != 0) {
            ((UrlRequest) obj).cancel();
            return;
        }
        ype ypeVar = (ype) obj;
        if (!ypeVar.e() || ypeVar.d() || ypeVar.c()) {
            return;
        }
        long jB = ypeVar.j.b();
        ArrayList arrayListA = ype.a(ypeVar.w);
        if (ypeVar.y.i()) {
            if (i == 1) {
                arrayListA.add(new QoeErrorDetail("type", "connecttimeout"));
            } else if (i != 2) {
                arrayListA.add(new QoeErrorDetail("type", "unspecifiedtimeout"));
            } else {
                arrayListA.add(new QoeErrorDetail("type", "readtimeout"));
            }
            qoeError = new QoeError("net.timeout", arrayListA);
        } else {
            qoeError = new QoeError("net.unavailable", arrayListA);
        }
        ypeVar.b(qoeError, false);
        if (ypeVar.v != null) {
            ypeVar.v.cancel();
        }
        ypj ypjVar = ypeVar.h;
        if (ypjVar != null) {
            ypjVar.f(qoeError.getCode(), jB);
        }
    }
}
