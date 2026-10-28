package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import org.chromium.net.NetError;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oxb implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oxb(oxe oxeVar, Context context, int i, CharSequence charSequence, int i2, View view, int i3) {
        this.$cid = i3;
        this.d = oxeVar;
        this.e = context;
        this.a = i;
        this.b = charSequence;
        this.c = i2;
        this.f = view;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        final TextClassification textClassificationClassifyText = null;
        if (this.$cid == 0) {
            int i = this.c;
            CharSequence charSequence = this.b;
            int i2 = this.a;
            Object obj = this.e;
            try {
                TextClassificationManager textClassificationManagerM810m = gp$$ExternalSyntheticApiModelOutline2.m810m(((Context) obj).getSystemService(gp$$ExternalSyntheticApiModelOutline2.m812m()));
                if (textClassificationManagerM810m != null) {
                    int iMax = Math.max(0, i2 + NetError.ERR_SOCKS_CONNECTION_FAILED);
                    CharSequence charSequenceSubSequence = charSequence.subSequence(iMax, Math.min(charSequence.length(), i + 120));
                    int i3 = i2 - iMax;
                    int i4 = i - iMax;
                    TextClassifier textClassifierCreateTextClassificationSession = textClassificationManagerM810m.createTextClassificationSession(new TextClassificationContext.Builder(((Context) obj).getPackageName(), "textview").build());
                    try {
                        textClassificationClassifyText = textClassifierCreateTextClassificationSession.classifyText(new TextClassification.Request.Builder(charSequenceSubSequence, i3, i4).build());
                        textClassifierCreateTextClassificationSession.destroy();
                    } catch (Throwable th) {
                        textClassifierCreateTextClassificationSession.destroy();
                        throw th;
                    }
                }
            } catch (RuntimeException unused) {
            }
            Object obj2 = this.f;
            final oxe oxeVar = (oxe) this.d;
            final View view = (View) obj2;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: oxc
                @Override // java.lang.Runnable
                public final void run() {
                    oxe oxeVar2 = oxeVar;
                    oxeVar2.o = textClassificationClassifyText;
                    oxeVar2.F(view);
                }
            });
            return;
        }
        bre breVar = (bre) ((qcb) this.f).a;
        afv afvVar = breVar.c;
        Object obj3 = this.d;
        zf zfVar = (zf) obj3;
        IBinder iBinderL = zfVar.l();
        afvVar.remove(iBinderL);
        int i5 = this.c;
        int i6 = this.a;
        String str = (String) this.b;
        bqp bqpVar = new bqp(breVar, str, i6, i5, zfVar);
        breVar.d = bqpVar;
        bqpVar.f = breVar.a(str, i5, (Bundle) this.e);
        breVar.d = null;
        if (bqpVar.f == null) {
            getClass().getName();
            try {
                ((zf) obj3).m(2, null);
                return;
            } catch (RemoteException unused2) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat((String) this.b));
                return;
            }
        }
        try {
            Object obj4 = ((qcb) this.f).a;
            ((bre) obj4).c.put(iBinderL, bqpVar);
            iBinderL.linkToDeath(bqpVar, 0);
            MediaSessionCompat$Token mediaSessionCompat$Token = ((bre) obj4).f;
            if (mediaSessionCompat$Token != null) {
                Object obj5 = this.d;
                bqo bqoVar = bqpVar.f;
                String str2 = bqoVar.a;
                Bundle bundle = bqoVar.b;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                Bundle bundle2 = new Bundle();
                bundle2.putString("data_media_item_id", str2);
                bundle2.putParcelable("data_media_session_token", mediaSessionCompat$Token);
                bundle2.putBundle("data_root_hints", bundle);
                ((zf) obj5).m(1, bundle2);
            }
        } catch (RemoteException unused3) {
            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat((String) this.b));
            ((bre) ((qcb) this.f).a).c.remove(iBinderL);
        }
    }

    public oxb(qcb qcbVar, zf zfVar, String str, int i, int i2, Bundle bundle, int i3) {
        this.$cid = i3;
        this.f = qcbVar;
        this.d = zfVar;
        this.b = str;
        this.a = i;
        this.c = i2;
        this.e = bundle;
    }
}
