package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.AudioAttributes;
import android.media.browse.MediaBrowser;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class zf {
    public final Object a;

    public zf(Window window, View view) {
        zf zfVar = new zf(view);
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new bbt(window, zfVar);
        } else {
            this.a = Build.VERSION.SDK_INT >= 30 ? new bbr(window, zfVar) : new bbq(window, zfVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    public static zf G(bwb bwbVar) {
        String str;
        String string;
        bwbVar.Q(2);
        int iN = bwbVar.n();
        int i = iN >> 1;
        int i2 = iN & 1;
        int iN2 = bwbVar.n() >> 3;
        if (i == 4 || i == 5) {
            str = "dvhe";
        } else if (i != 20) {
            switch (i) {
                case 7:
                case 8:
                    str = "dvhe";
                    break;
                case 9:
                    str = "dvav";
                    break;
                case 10:
                    str = "dav1";
                    break;
                default:
                    str = null;
                    break;
            }
        } else {
            str = "dvh1";
        }
        int i3 = (i2 << 5) | iN2;
        if (str == null) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i < 10 ? ".0" : ".");
            sb.append(i);
            sb.append(i3 >= 10 ? "." : ".0");
            sb.append(i3);
            string = sb.toString();
        }
        return new zf(string, (byte[]) null);
    }

    public static final boolean P(augy augyVar) {
        augyVar.getClass();
        if ((augyVar.c == 107 ? (auhv) augyVar.d : auhv.a).c == 2) {
            auhv auhvVar = augyVar.c == 107 ? (auhv) augyVar.d : auhv.a;
            auih auihVar = auhvVar.c == 2 ? (auih) auhvVar.d : auih.a;
            auihVar.getClass();
            if (!yno.gC(auihVar) && !yno.gB(auihVar) && !yno.gA(auihVar)) {
                return true;
            }
        } else {
            int i = augyVar.c;
            if (i != 105 && i != 107) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0058 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int k(bse bseVar) {
        String str = bseVar.q;
        if (str == null || !bsy.k(str)) {
            return SemanticState.Focused;
        }
        int i = bwp.a;
        switch (str.hashCode()) {
            case -1487656890:
                if (!str.equals("image/avif") || Build.VERSION.SDK_INT < 34) {
                    return 129;
                }
                return 132;
            case -1487464693:
                if (str.equals("image/heic")) {
                    return 132;
                }
                return 129;
            case -1487464690:
                if (str.equals("image/heif")) {
                    return 132;
                }
                return 129;
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    return 132;
                }
                return 129;
            case -1487018032:
                if (str.equals("image/webp")) {
                    return 132;
                }
                return 129;
            case -879272239:
                if (str.equals("image/bmp")) {
                    return 132;
                }
                return 129;
            case -879258763:
                if (str.equals("image/png")) {
                    return 132;
                }
                return 129;
            default:
                return 129;
        }
    }

    public final void A(int i, int i2) {
        ((bih) this.a).h(i, i2);
    }

    public final void B(int i, long j) {
        ((bih) this.a).j(i, j);
    }

    public final void C(int i, int i2) {
        ((bih) this.a).t(i, (i2 << 1) ^ (i2 >> 31));
    }

    public final void D(int i, long j) {
        ((bih) this.a).v(i, (j << 1) ^ (j >> 63));
    }

    public final void E(int i, int i2) {
        ((bih) this.a).t(i, i2);
    }

    public final void F(int i, long j) {
        ((bih) this.a).v(i, j);
    }

    public final vis H(vir virVar, boolean z) {
        return new vis((Context) this.a, ahbo.a, virVar, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, tgg] */
    public final Object I(wjf wjfVar, awoq awoqVar) {
        vdk vdkVar;
        if (awoqVar instanceof vdk) {
            vdkVar = (vdk) awoqVar;
            int i = vdkVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vdkVar.b = i - Integer.MIN_VALUE;
            } else {
                vdkVar = new vdk(this, awoqVar);
            }
        } else {
            vdkVar = new vdk(this, awoqVar);
        }
        Object objAd = vdkVar.a;
        awox awoxVar = awox.a;
        int i2 = vdkVar.b;
        try {
            if (i2 == 0) {
                atqp.j(objAd);
                StreamingDataOuterClass$StreamingData defaultInstance = wjfVar.u().h;
                if (defaultInstance == null) {
                    defaultInstance = StreamingDataOuterClass$StreamingData.getDefaultInstance();
                }
                aiie aiieVar = defaultInstance.g;
                aiieVar.getClass();
                ArrayList<anha> arrayList = new ArrayList();
                for (Object obj : aiieVar) {
                    anha anhaVar = (anha) obj;
                    if (((anhaVar.b == 1 ? (angz) anhaVar.c : angz.a).b & 4) != 0) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(atqq.N(arrayList, 10));
                for (anha anhaVar2 : arrayList) {
                    arrayList2.add((anhaVar2.b == 1 ? (angz) anhaVar2.c : angz.a).c);
                }
                String str = (String) awrc.f(Optional.ofNullable(atqq.Z(arrayList2)));
                if (str != null) {
                    ?? r10 = this.a;
                    vdj vdjVar = new vdj(str);
                    vdjVar.B(tok.SHORTS_WAVEFORM_DOWNLOAD);
                    ListenableFuture listenableFutureC = r10.c(vdjVar);
                    listenableFutureC.getClass();
                    vdkVar.b = 1;
                    objAd = awrc.ad(listenableFutureC, vdkVar);
                    if (objAd == awoxVar) {
                        return awoxVar;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objAd);
            tnx tnxVar = (tnx) objAd;
            if (tnxVar.h()) {
                return tnxVar.c().a;
            }
            twu.d("WaveformDownloader", 6, "Failed to fetch waveform data", null);
            return null;
        } catch (Exception e) {
            twu.d("WaveformDownloader", 6, "Failed to fetch waveform data", e);
        }
    }

    public final void J(vcm vcmVar) {
        ((awly) this.a).kk(vcmVar);
    }

    public final void K(Bitmap bitmap, vbs vbsVar) {
        int height = bitmap.getHeight() + 2;
        int iCeil = ((int) Math.ceil(((double) (bitmap.getWidth() + 2)) / 4.0d)) << 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, height, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (iCeil - bitmap.getWidth()) / 2, (height - bitmap.getHeight()) / 2, new Paint(2));
        new vbt((syw) this.a, vbsVar).execute(bitmapCreateBitmap);
    }

    public final awly L(arft arftVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a;
        if (concurrentHashMap.containsKey(arftVar)) {
            return (awly) concurrentHashMap.get(arftVar);
        }
        awlu awluVarAv = awlu.av(1);
        concurrentHashMap.put(arftVar, awluVarAv);
        return awluVarAv;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final agke M(vbd vbdVar) {
        return (agke) Map.EL.getOrDefault(this.a, vbdVar, agpi.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void N(uxp uxpVar) {
        this.a.add(uxpVar);
    }

    public final String O(augy augyVar) {
        augyVar.getClass();
        String str = augyVar.f;
        str.getClass();
        if (str.length() > 0) {
            String str2 = augyVar.f;
            str2.getClass();
            return str2;
        }
        int i = augyVar.c;
        if (i == 101) {
            String str3 = (i == 101 ? (augu) augyVar.d : augu.a).c;
            str3.getClass();
            if (str3.length() > 0) {
                String str4 = (augyVar.c == 101 ? (augu) augyVar.d : augu.a).c;
                str4.getClass();
                return str4;
            }
        }
        int i2 = augyVar.c;
        if (i2 == 103) {
            String str5 = (i2 == 103 ? (augr) augyVar.d : augr.a).e;
            str5.getClass();
            if (str5.length() > 0) {
                String str6 = (augyVar.c == 103 ? (augr) augyVar.d : augr.a).e;
                str6.getClass();
                return str6;
            }
            String str7 = (augyVar.c == 103 ? (augr) augyVar.d : augr.a).d;
            str7.getClass();
            if (str7.length() > 0) {
                String str8 = (augyVar.c == 103 ? (augr) augyVar.d : augr.a).d;
                str8.getClass();
                return str8;
            }
        }
        if ((augyVar.c == 107 ? (auhv) augyVar.d : auhv.a).c == 2) {
            auhv auhvVar = augyVar.c == 107 ? (auhv) augyVar.d : auhv.a;
            auih auihVar = auhvVar.c == 2 ? (auih) auhvVar.d : auih.a;
            auihVar.getClass();
            if (yno.gC(auihVar)) {
                String string = ((Context) this.a).getString(R.string.shorts_a11y_product_sticker);
                string.getClass();
                return string;
            }
            int i3 = auihVar.c;
            if (i3 == 3) {
                auib auibVar = (auib) auihVar.d;
                if ((auibVar.b & 4) != 0) {
                    aqcx aqcxVar = auibVar.c;
                    if (aqcxVar == null) {
                        aqcxVar = aqcx.a;
                    }
                    String str9 = aqcxVar.c;
                    str9.getClass();
                    if (str9.length() > 0) {
                        aqcx aqcxVar2 = (auihVar.c == 3 ? (auib) auihVar.d : auib.a).c;
                        if (aqcxVar2 == null) {
                            aqcxVar2 = aqcx.a;
                        }
                        String str10 = aqcxVar2.c;
                        str10.getClass();
                        return str10;
                    }
                }
                String string2 = ((Context) this.a).getString(R.string.shorts_a11y_prompt_sticker);
                string2.getClass();
                return string2;
            }
            if (i3 == 4) {
                String string3 = ((Context) this.a).getString(R.string.shorts_a11y_poll_sticker);
                string3.getClass();
                return string3;
            }
            if (i3 == 5) {
                String str11 = ((auid) auihVar.d).c;
                str11.getClass();
                if (str11.length() > 0) {
                    String str12 = (auihVar.c == 5 ? (auid) auihVar.d : auid.a).c;
                    str12.getClass();
                    return str12;
                }
                String string4 = ((Context) this.a).getString(R.string.shorts_a11y_quiz_sticker);
                string4.getClass();
                return string4;
            }
            if (yno.gB(auihVar)) {
                String string5 = ((Context) this.a).getString(R.string.shorts_a11y_image_sticker);
                string5.getClass();
                return string5;
            }
            if (yno.gA(auihVar)) {
                String string6 = ((Context) this.a).getString(R.string.shorts_a11y_ai_sticker);
                string6.getClass();
                return string6;
            }
        }
        int i4 = augyVar.c;
        if (i4 == 105 || i4 == 107) {
            String string7 = ((Context) this.a).getString(R.string.shorts_a11y_image_sticker);
            string7.getClass();
            return string7;
        }
        String string8 = ((Context) this.a).getString(R.string.shorts_a11y_sticker);
        string8.getClass();
        return string8;
    }

    public final boolean a() {
        return vz.d((Context) this.a);
    }

    public final void b(int i) {
        ((bbm) this.a).b(i);
    }

    public final void c(boolean z) {
        ((bbm) this.a).c(z);
    }

    public final void d(boolean z) {
        ((bbm) this.a).d(z);
    }

    public final void e() {
        ((bbm) this.a).f();
    }

    public final void f() {
        ((bbm) this.a).g();
    }

    public final void g() {
        ((azq) this.a).a();
    }

    public final void h() {
        ((azq) this.a).b();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [azd, java.lang.Object] */
    public final void i(int i, int i2, int i3, boolean z) {
        this.a.a(i, i2, i3, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [azd, java.lang.Object] */
    public final void j(int i, int i2, int i3, int i4) {
        this.a.b(i, i2, i3, i4);
    }

    public final IBinder l() {
        return ((Messenger) this.a).getBinder();
    }

    public final void m(int i, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle);
        ((Messenger) this.a).send(messageObtain);
    }

    public final void n() {
        ((MediaBrowserService.Result) this.a).detach();
    }

    public final void o(Object obj) {
        ArrayList arrayList = null;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                ((MediaBrowserService.Result) this.a).sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            ((MediaBrowserService.Result) this.a).sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        Object obj2 = this.a;
        List<Parcel> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        ((MediaBrowserService.Result) obj2).sendResult(arrayList);
    }

    public final void p(int i, boolean z) {
        ((bih) this.a).e(i, z);
    }

    public final void q(int i, bhy bhyVar) {
        ((bih) this.a).f(i, bhyVar);
    }

    public final void r(int i, double d) {
        ((bih) this.a).I(i, d);
    }

    public final void s(int i, int i2) {
        ((bih) this.a).l(i, i2);
    }

    public final void t(int i, int i2) {
        ((bih) this.a).h(i, i2);
    }

    public final void u(int i, long j) {
        ((bih) this.a).j(i, j);
    }

    public final void v(int i, float f) {
        ((bih) this.a).K(i, f);
    }

    public final void w(int i, Object obj, bjs bjsVar) {
        bih bihVar = (bih) this.a;
        bihVar.s(i, 3);
        bjsVar.i((bhn) obj, this);
        bihVar.s(i, 4);
    }

    public final void x(int i, int i2) {
        ((bih) this.a).l(i, i2);
    }

    public final void y(int i, long j) {
        ((bih) this.a).v(i, j);
    }

    public final void z(int i, Object obj, bjs bjsVar) {
        bhn bhnVar = (bhn) obj;
        bih bihVar = (bih) this.a;
        bihVar.s(i, 2);
        bihVar.u(bhnVar.c(bjsVar));
        bjsVar.i(bhnVar, this);
    }

    public zf(TextView textView) {
        this.a = new eol(textView);
    }

    public zf(Object obj) {
        this.a = obj;
    }

    public zf(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public zf() {
        this.a = new AudioAttributes.Builder();
    }

    public zf(Context context) {
        this.a = context.getApplicationContext();
    }

    public zf(Context context, byte[] bArr) {
        context.getClass();
        this.a = context;
    }

    public zf(View view) {
        this.a = Build.VERSION.SDK_INT >= 30 ? new azg(view) : new aze(view);
    }

    public zf(View view, byte[] bArr) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new azb(view);
        } else {
            this.a = new azc();
        }
    }

    public zf(byte[] bArr) {
        this();
    }

    public zf(byte[] bArr, char[] cArr) {
        this.a = new HashSet();
    }

    public zf(Context context, byte[] bArr, byte[] bArr2) {
        context.getClass();
        this.a = context;
    }

    public zf(awmd awmdVar) {
        awmdVar.getClass();
        this.a = awmdVar;
    }

    public zf(bih bihVar) {
        byte[] bArr = bix.a;
        this.a = bihVar;
        bihVar.b = this;
    }

    public zf(short[] sArr) {
        this.a = new ArrayList();
    }

    public zf(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new EnumMap(vbd.class);
    }

    public zf(char[] cArr, byte[] bArr) {
        this.a = new ConcurrentHashMap();
    }

    public zf(qcb qcbVar) {
        this.a = qcbVar.A(1, vcb.f, vcb.i);
    }

    public zf(byte[] bArr, byte[] bArr2) {
        this.a = new awlo().az();
    }

    public zf(char[] cArr) {
        this.a = new awlo();
    }

    public zf(tgg tggVar, vxz vxzVar) {
        tggVar.getClass();
        vxzVar.getClass();
        this.a = tggVar;
    }
}
