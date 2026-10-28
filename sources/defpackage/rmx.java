package defpackage;

import android.content.ContentValues;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.Optional;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rmx implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public rmx(aesq aesqVar, slb slbVar, sxv sxvVar, int i) {
        this.$cid = i;
        this.a = slbVar;
        this.c = sxvVar;
        this.b = aesqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.Object, uxi] */
    /* JADX WARN: Type inference failed for: r0v53, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, stb] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, stb] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, vio] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, tyh] */
    /* JADX WARN: Type inference failed for: r2v49, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, xgn] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, java.util.Collection] */
    @Override // java.lang.Runnable
    public final void run() {
        Long l;
        Optional optionalEmpty;
        String string = null;
        switch (this.$cid) {
            case 0:
                tym.h((View) this.a, this.b, (Class) this.c);
                return;
            case 1:
                rmc rmcVar = (rmc) this.b;
                rmcVar.a.getWritableDatabase().insertWithOnConflict((String) this.c, null, (ContentValues) this.a, 5);
                rmcVar.b.open();
                return;
            case 2:
                arar ararVar = (arar) this.b;
                if ((ararVar.c & 64) != 0) {
                    alay alayVar = ararVar.i;
                    if (alayVar == null) {
                        alayVar = alay.a;
                    }
                    string = ackj.k(null, alayVar, null, false).toString();
                }
                ((rnf) ((rmx) this.a).a).g(string, new rne((Throwable) this.c));
                return;
            case 3:
                try {
                    Object obj = this.a;
                    rng rngVar = ((rnf) obj).b;
                    Uri uri = ((rnf) obj).n;
                    Object obj2 = this.c;
                    String str = ((rnf) obj).o;
                    taq.c();
                    if (!rngVar.d.u()) {
                        throw new rne("Must be signed in to upload");
                    }
                    try {
                        ablj abljVarC = ablj.c(rngVar.b.getContentResolver(), uri);
                        atzc atzcVar = new atzc();
                        if (str != null && !str.isEmpty()) {
                            atzcVar.d("X-YouTube-ChannelId", str);
                        }
                        atzcVar.d("Content-Type", "application/json-rpc; charset=utf-8");
                        zwa zwaVarE = rngVar.d.e();
                        if (!(zwaVarE instanceof rlt)) {
                            throw new rne("Sign in with AccountIdentity required");
                        }
                        zwk zwkVarD = rngVar.c.a((rlt) zwaVarE);
                        if (!zwkVarD.f()) {
                            throw new rne("Could not fetch auth token");
                        }
                        Optional optionalB = zwkVarD.b((String) obj2);
                        if (optionalB.isPresent()) {
                            atzcVar.d((String) ((Pair) optionalB.get()).first, (String) ((Pair) optionalB.get()).second);
                        }
                        try {
                            atze atzeVar = new atze(new BufferedInputStream(rngVar.b.getContentResolver().openInputStream((Uri) abljVarC.b)), abljVarC.a, 1048576);
                            atzn atznVar = new atzn();
                            atznVar.a = 600L;
                            atznVar.b = abljVarC.c;
                            atzo atzoVar = new atzo(atznVar);
                            atqo atqoVar = rngVar.e;
                            atzk atzkVarD = atqo.d((String) obj2, atzcVar, atzeVar, atzoVar);
                            try {
                                try {
                                    axoz axozVar = (axoz) atzkVarD.a().get();
                                    if (axozVar.d()) {
                                        throw new tni((Throwable) axozVar.b);
                                    }
                                    if (!axozVar.c()) {
                                        throw new tni();
                                    }
                                    Object obj3 = axozVar.a;
                                    int i = ((twp) obj3).a;
                                    if (i < 0) {
                                        throw new tni();
                                    }
                                    Object obj4 = ((twp) obj3).c;
                                    obj4.getClass();
                                    try {
                                        Object obj5 = ((twp) obj3).b;
                                        if (obj5 == null) {
                                            throw new tni();
                                        }
                                        byte[] bArrB = agyi.b((InputStream) obj5);
                                        if (i != 200) {
                                            throw new tob(yno.L(i, (atzc) obj4, bArrB));
                                        }
                                        try {
                                            ((rnf) obj).p = new JSONObject(new String(bArrB, rng.a)).getString("encryptedBlobId");
                                            ((rnf) this.a).d.execute(new rhl(this, 17));
                                            return;
                                        } catch (JSONException unused) {
                                            throw new tnp(yno.L(200, (atzc) obj4, bArrB));
                                        }
                                    } catch (IOException unused2) {
                                        throw new tni();
                                    }
                                } catch (InterruptedException e) {
                                    atzkVarD.b();
                                    throw e;
                                } catch (ExecutionException e2) {
                                    if (e2.getCause() != null) {
                                        throw new tni(e2.getCause());
                                    }
                                    throw new tni();
                                }
                            } catch (tni | tnp | tob e3) {
                                throw new rne(e3);
                            }
                        } catch (FileNotFoundException e4) {
                            throw new rne(e4);
                        }
                    } catch (IOException e5) {
                        throw new rne(e5);
                    }
                } catch (Exception e6) {
                    if (e6 instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    ((rnf) this.a).d.execute(new rmx(this, (arar) this.b, e6, 2));
                    return;
                }
            case 4:
                ((rop) this.b).g((aoma) this.c, (rlt) this.a);
                return;
            case 5:
                ((rqa) this.b).d((rlt) this.a, rmv.a, (ajwo) this.c);
                return;
            case 6:
                aivk aivkVar = (aivk) this.c;
                wjk wjkVar = new wjk(aivkVar.e, 1);
                zxi zxiVar = (zxi) this.b;
                zxiVar.k = wjkVar;
                zxiVar.d = aivkVar.f;
                snz snzVar = (snz) this.a;
                wgn wgnVar = snzVar.b;
                if (wgnVar != null) {
                    zxiVar.e = wgnVar.iK();
                }
                snzVar.a.a(zxiVar, zzl.b, Duration.ofMillis(aivkVar.i));
                return;
            case 7:
                Object obj6 = this.a;
                String str2 = ((smk) obj6).d;
                if (TextUtils.isEmpty(str2)) {
                    ((sxv) this.c).b(((smc) obj6).o, null);
                    return;
                }
                Object obj7 = this.b;
                aczl aczlVar = (aczl) ((aesq) obj7).a;
                ArrayList arrayList = new ArrayList((Collection) aczlVar.f);
                arrayList.add(new spq((slb) obj6));
                abpd abpdVar = new abpd((tbt) aczlVar.d, (abps) aczlVar.e, (abrg) aczlVar.g, aczlVar.c, aczlVar.b, arrayList, (txp) aczlVar.a);
                try {
                    abnk abnkVar = new abnk();
                    abnkVar.a = aboc.h(str2, "", -1);
                    abnl abnlVarA = abnkVar.a();
                    String str3 = ((smc) obj6).o;
                    ((aesq) obj7).c = abpdVar.i(abnlVarA, str3, -1, null, null, false, abnp.a);
                    ((sxv) this.c).b(str3, (wjf) ((aesq) obj7).c.get(2L, TimeUnit.SECONDS));
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e7) {
                    ((aesq) this.b).c.cancel(true);
                    ((sxv) this.c).iT(((smc) this.a).o, new ExecutionException("Failed to get adPlayerResponse for mdx", e7));
                    return;
                }
            case 8:
                ((srd) this.a).f((sre) this.b, this.c);
                return;
            case 9:
                ((srd) this.a).f((sre) this.b, this.c);
                return;
            case 10:
                ssz sszVar = (ssz) this.a;
                if (sszVar.N.R().booleanValue() || (l = sszVar.H) == null) {
                    return;
                }
                Duration durationOfMillis = Duration.ofMillis(l.longValue());
                Editable text = sszVar.r.getText();
                int selectionStart = Selection.getSelectionStart(text);
                int selectionEnd = Selection.getSelectionEnd(text);
                boolean z = selectionStart != 0 && new String(new char[]{' ', '\n', '\r', '-', '_'}).indexOf(text.charAt(selectionStart + (-1))) == -1;
                long millis = (durationOfMillis.toMillis() + 500) / 1000;
                long j = millis / 3600;
                long j2 = millis % 60;
                long j3 = (millis % 3600) / 60;
                String str4 = j > 0 ? String.format(Locale.getDefault(), "%d:%02d:%02d", Long.valueOf(j), Long.valueOf(j3), Long.valueOf(j2)) : String.format(Locale.getDefault(), "%d:%02d", Long.valueOf(j3), Long.valueOf(j2));
                ?? r5 = this.b;
                text.replace(selectionStart, selectionEnd, (true == z ? " " : "") + str4 + ' ');
                if (r5 != 0) {
                    r5.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj((xhc) this.c), null);
                    return;
                }
                return;
            case 11:
                taq.d();
                final vgj vgjVar = (vgj) ((vgi) this.c).a;
                vhg vhgVar = vgjVar.v;
                vhgVar.B((Uri) this.b);
                ImageView imageView = vgjVar.s;
                imageView.setImageDrawable((Drawable) this.a);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: vgh
                    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, viz] */
                    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, xgm] */
                    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.concurrent.Executor] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        vgj vgjVar2 = vgjVar;
                        vhg vhgVar2 = vgjVar2.v;
                        vhgVar2.m.b(vgjVar2.w, vgjVar2.u);
                        if (vhgVar2.z() != null) {
                            vhgVar2.z().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(yno.fl(vgjVar2.t).G()), null);
                            vhgVar2.z().l(new xgj(xhb.b(39103)));
                        }
                        vhh vhhVar = vhgVar2.p;
                        if (vhhVar != null) {
                            vhhVar.a();
                        }
                        via viaVar = vhgVar2.i;
                        apji apjiVar = vgjVar2.w;
                        Optional optionalFj = yno.fj(apjiVar);
                        if (optionalFj.isEmpty()) {
                            zvp.a(zvn.b, zvm.y, "VideoFX: Static Sticker added without valid uri");
                            return;
                        }
                        if (yno.fk(apjiVar).size() > 1) {
                            viaVar.f.hB().l(new xgj(xhb.b(65452)));
                        }
                        List listFk = yno.fk(apjiVar);
                        if (!listFk.isEmpty()) {
                            viaVar.c.execute(afwl.i(new uqd(viaVar, listFk, 6)));
                        }
                        Uri uri2 = (Uri) optionalFj.get();
                        aihf aihfVarCreateBuilder = augs.a.createBuilder();
                        String str5 = (String) yno.fi(uri2).get();
                        aihfVarCreateBuilder.copyOnWrite();
                        augs augsVar = (augs) aihfVarCreateBuilder.instance;
                        augsVar.b |= 1;
                        augsVar.c = str5;
                        List listFk2 = yno.fk(apjiVar);
                        if (!listFk2.isEmpty()) {
                            aihf aihfVarCreateBuilder2 = auhi.a.createBuilder();
                            aihfVarCreateBuilder2.copyOnWrite();
                            auhi auhiVar = (auhi) aihfVarCreateBuilder2.instance;
                            aiie aiieVar = auhiVar.d;
                            if (!aiieVar.c()) {
                                auhiVar.d = aihn.mutableCopy(aiieVar);
                            }
                            aifs.addAll(listFk2, auhiVar.d);
                            String str6 = (String) listFk2.get(0);
                            aihfVarCreateBuilder2.copyOnWrite();
                            auhi auhiVar2 = (auhi) aihfVarCreateBuilder2.instance;
                            str6.getClass();
                            auhiVar2.b |= 1;
                            auhiVar2.c = str6;
                            auhi auhiVar3 = (auhi) aihfVarCreateBuilder2.build();
                            aihfVarCreateBuilder.copyOnWrite();
                            augs augsVar2 = (augs) aihfVarCreateBuilder.instance;
                            auhiVar3.getClass();
                            augsVar2.d = auhiVar3;
                            augsVar2.b |= 2;
                        }
                        jrr jrrVar = (jrr) augy.a.createBuilder();
                        jrrVar.copyOnWrite();
                        augy augyVar = (augy) jrrVar.instance;
                        augs augsVar3 = (augs) aihfVarCreateBuilder.build();
                        augsVar3.getClass();
                        augyVar.d = augsVar3;
                        augyVar.c = 105;
                        aihf aihfVarCreateBuilder3 = vbu.a.createBuilder();
                        String str7 = (String) yno.fi(uri2).get();
                        aihfVarCreateBuilder3.copyOnWrite();
                        vbu vbuVar = (vbu) aihfVarCreateBuilder3.instance;
                        vbuVar.b |= 1;
                        vbuVar.c = str7;
                        aihfVarCreateBuilder3.copyOnWrite();
                        vbu vbuVar2 = (vbu) aihfVarCreateBuilder3.instance;
                        vbuVar2.b |= 2;
                        vbuVar2.d = SemanticState.LiveRegion;
                        aihfVarCreateBuilder3.copyOnWrite();
                        vbu vbuVar3 = (vbu) aihfVarCreateBuilder3.instance;
                        vbuVar3.b |= 4;
                        vbuVar3.e = SemanticState.LiveRegion;
                        vbu vbuVar4 = (vbu) aihfVarCreateBuilder3.build();
                        zak zakVar = new zak(null, null);
                        zakVar.c(vbuVar4);
                        zakVar.d(Float.valueOf(0.2f));
                        viaVar.b.g(jrrVar, zakVar.b());
                        auhi auhiVar4 = ((augs) aihfVarCreateBuilder.instance).d;
                        if (auhiVar4 == null) {
                            auhiVar4 = auhi.a;
                        }
                        if (auhiVar4.d.size() > 1) {
                            vhn vhnVar = (vhn) viaVar.e;
                            vhnVar.d(Math.round((vhnVar.a() / 2.0f) - vhnVar.g));
                        }
                    }
                });
                if (vhgVar.z() != null) {
                    xgn xgnVarZ = vhgVar.z();
                    aqcs aqcsVar = vgjVar.t;
                    xgnVarZ.y(aqcsVar, yno.fl(aqcsVar), null);
                }
                aqcs aqcsVar2 = vgjVar.t;
                if (aqcsVar2 == null) {
                    optionalEmpty = Optional.empty();
                } else if ((aqcsVar2.b & 1) != 0) {
                    aqmh aqmhVar = aqcsVar2.c;
                    if (aqmhVar == null) {
                        aqmhVar = aqmh.a;
                    }
                    aiqe aiqeVar = aqmhVar.e;
                    if (aiqeVar == null) {
                        aiqeVar = aiqe.a;
                    }
                    aiqd aiqdVar = aiqeVar.c;
                    if (aiqdVar == null) {
                        aiqdVar = aiqd.a;
                    }
                    optionalEmpty = Optional.of(aiqdVar.c);
                } else if (aqcsVar2.d.size() != 0) {
                    aiqe aiqeVar2 = ((aqmh) aqcsVar2.d.get(0)).e;
                    if (aiqeVar2 == null) {
                        aiqeVar2 = aiqe.a;
                    }
                    aiqd aiqdVar2 = aiqeVar2.c;
                    if (aiqdVar2 == null) {
                        aiqdVar2 = aiqd.a;
                    }
                    optionalEmpty = Optional.of(aiqdVar2.c);
                } else {
                    optionalEmpty = Optional.empty();
                }
                imageView.setContentDescription((CharSequence) optionalEmpty.orElse(null));
                return;
            case 12:
                if (nuo.h(((vhi) this.b).f)) {
                    this.c.jb(this.a);
                    return;
                }
                return;
            default:
                ((vic) ((via) this.b).a).a((Uri) ((Optional) this.c).get(), new vgi(this.a, 2));
                return;
        }
    }

    public /* synthetic */ rmx(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ rmx(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public rmx(rmx rmxVar, arar ararVar, Exception exc, int i) {
        this.$cid = i;
        this.b = ararVar;
        this.c = exc;
        this.a = rmxVar;
    }

    public rmx(rnf rnfVar, String str, arar ararVar, int i) {
        this.$cid = i;
        this.c = str;
        this.b = ararVar;
        this.a = rnfVar;
    }

    public /* synthetic */ rmx(rqa rqaVar, rlt rltVar, ajwo ajwoVar, int i) {
        this.$cid = i;
        this.b = rqaVar;
        this.a = rltVar;
        this.c = ajwoVar;
    }

    public /* synthetic */ rmx(vgi vgiVar, Uri uri, Drawable drawable, int i) {
        this.$cid = i;
        this.c = vgiVar;
        this.b = uri;
        this.a = drawable;
    }
}
