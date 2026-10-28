package defpackage;

import android.content.ContentResolver;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.BatteryManager;
import android.os.Build;
import android.provider.MediaStore;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tsn implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tsn(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, java.util.Collection] */
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
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = 3;
        int i2 = 9;
        int i3 = 20;
        int i4 = 1;
        int i5 = 2;
        int i6 = 0;
        Object objDecodeBitmap = null;
        switch (this.$cid) {
            case 0:
                Object obj = this.b;
                Locale locale = Locale.getDefault();
                TextToSpeech textToSpeech = (TextToSpeech) obj;
                int iIsLanguageAvailable = textToSpeech.isLanguageAvailable(locale);
                Object obj2 = this.a;
                if (iIsLanguageAvailable < 0 || textToSpeech.setLanguage(locale) == -1) {
                    ((agrc) ((agrc) tsr.a.c()).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "onInit", 319, "TextToSpeechController.java")).t("TTS failed during initialization: LANG_MISSING_DATA");
                    ((tsr) obj2).a("TTS failed during initialization with code: LANG_MISSING_DATA");
                } else {
                    textToSpeech.setOnUtteranceProgressListener((UtteranceProgressListener) obj2);
                    tsr tsrVar = (tsr) obj2;
                    if (tsrVar.c != null) {
                        tsrVar.g(tsrVar.c, 0, tsrVar.d, "TextToSpeechController");
                    }
                    tsrVar.c = null;
                    tsrVar.g.kn();
                }
                return objDecodeBitmap;
            case 1:
                agrf agrfVar = tsr.a;
                Object obj3 = this.a;
                TextToSpeech textToSpeech2 = (TextToSpeech) this.b;
                Locale locale2 = (Locale) obj3;
                if (textToSpeech2.isLanguageAvailable(locale2) >= 0) {
                    textToSpeech2.setLanguage(locale2);
                } else {
                    ((agrc) ((agrc) tsr.a.c()).k("com/google/android/libraries/youtube/common/tts/TextToSpeechController", "setLanguage", 248, "TextToSpeechController.java")).t("TTS Locale is not available");
                }
                return objDecodeBitmap;
            case 2:
                twf twfVar = (twf) this.b;
                agfr agfrVar = twfVar.a;
                long jLongValue = ((Long) this.a).longValue();
                if (!((Optional) agfrVar.io()).isEmpty()) {
                    long jB = twfVar.b.b();
                    if (jLongValue > 0 && twfVar.f) {
                        objDecodeBitmap = new twe(twfVar.e, jB - twfVar.d);
                    }
                    twfVar.d = jB;
                    if (twfVar.b()) {
                        twfVar.f = false;
                        return objDecodeBitmap;
                    }
                    twfVar.f = true;
                    twfVar.e = ((BatteryManager) ((Optional) agfrVar.io()).get()).getIntProperty(2);
                }
                return objDecodeBitmap;
            case 3:
                String strValueOf = String.valueOf(String.valueOf(UUID.randomUUID()));
                syw sywVar = ((upj) this.a).c;
                Object obj4 = this.b;
                String strConcat = strValueOf.concat(".png");
                if (sywVar.c(strConcat, (qcb) obj4)) {
                    return new File(sywVar.b, strConcat);
                }
                return objDecodeBitmap;
            case 4:
                use useVar = (use) this.b;
                aaok aaokVar = useVar.d;
                Object obj5 = this.a;
                agke agkeVar = agpi.a;
                auhs auhsVar = (auhs) obj5;
                usd usdVarA = useVar.a(auhsVar);
                if (aaokVar.F() && agkeVar.isEmpty()) {
                    agke agkeVarN = agke.n(auhsVar.g);
                    if (!agkeVarN.isEmpty()) {
                        agjz agjzVar = new agjz(4);
                        int size = agkeVarN.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            agjzVar.h(new ury((aufd) agkeVarN.get(i7), null));
                        }
                        usdVarA.h(new uug(agjzVar.g(), 0));
                    }
                } else {
                    use.b(usdVarA, agkeVar);
                }
                return usdVarA;
            case 5:
                try {
                    int i8 = Build.VERSION.SDK_INT;
                    Object obj6 = this.a;
                    Object obj7 = this.b;
                    Uri uri = ((uji) obj6).b;
                    objDecodeBitmap = i8 >= 29 ? ImageDecoder.decodeBitmap(ImageDecoder.createSource((ContentResolver) obj7, uri)) : MediaStore.Images.Media.getBitmap((ContentResolver) obj7, uri);
                    break;
                } catch (IOException e) {
                    zvp.b(zvn.a, zvm.f, "[ShortsCreation][Android][Camera]Failed loading image", e);
                }
                return Optional.ofNullable(objDecodeBitmap);
            case 6:
                return nuo.r(((vfb) this.a).h, ((qtt) this.b).b.a);
            case 7:
                vuk vukVar = ((voz) this.a).b;
                return tzk.C(vukVar.p, vukVar.c.f(), null).p().ak(new var(this.b, i3));
            case 8:
                return ((avmc) this.a).C(new vpi(this.b, i5));
            case 9:
                return ((avlh) this.a).ak(new vpi(this.b, i2));
            case 10:
                Object obj8 = this.a;
                Object obj9 = this.b;
                return ((vuk) obj9).l.ak(new mnt(obj9, obj8, 11));
            case 11:
                return ((avlh) this.a).al(new vpi(this.b, i3), new vqe(6));
            case 12:
                return ((avlh) this.a).ak(new vva(this.b, i4));
            case 13:
                return ((avlh) this.a).ak(new vpi(this.b, 19));
            case 14:
                return ((avlh) this.a).ak(new vva(((vvd) this.b).b, i6));
            case 15:
                return ((avlh) this.a).al(new vva(this.b, i5), new vqe(7));
            case 16:
                return ((vzx) this.b).b((String) this.a);
            case 17:
                return ((wcd) this.b).a.h(this.a);
            case 18:
                return ((wcd) this.b).a.c((String) this.a);
            case 19:
                Object obj10 = this.a;
                wcd wcdVar = (wcd) this.b;
                awly awlyVarQ = wcd.q(wcdVar.b, obj10);
                awly awlyVarAz = awlu.au().az();
                return awlyVarAz.V(wcdVar.a.g((String) obj10)).v(new vtu(awlyVarQ.af(new vva(awlyVarAz, i2)), i)).H();
            default:
                Object obj11 = this.a;
                wcd wcdVar2 = (wcd) this.b;
                avlr avlrVarK = wcd.q(wcdVar2.b, obj11).K(new uxe(16));
                awly awlyVarAz2 = awlu.au().az();
                return awlyVarAz2.V(agev.h(wcdVar2.a.c((String) obj11))).v(new vtu(avlrVarK.af(new vva(awlyVarAz2, 10)), i));
        }
    }

    public /* synthetic */ tsn(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
