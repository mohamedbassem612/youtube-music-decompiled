package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class acb {
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public acb(Context context, int i) {
        int next;
        int depth;
        p();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            Resources.Theme theme = context.getTheme();
                            int depth2 = xml.getDepth() + 1;
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || ((depth = xml.getDepth()) < depth2 && next2 == 3)) {
                                    break;
                                }
                                if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                                    TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSetAsAttributeSet, afbg.a) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, afbg.a, 0, 0);
                                    afbk afbkVar = new afbk(afbk.h(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new afav(0.0f)));
                                    typedArrayObtainAttributes.recycle();
                                    int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                                    int[] iArr = new int[attributeCount];
                                    int i2 = 0;
                                    for (int i3 = 0; i3 < attributeCount; i3++) {
                                        int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i3);
                                        if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                            int i4 = i2 + 1;
                                            iArr[i2] = attributeSetAsAttributeSet.getAttributeBooleanValue(i3, false) ? attributeNameResource : -attributeNameResource;
                                            i2 = i4;
                                        }
                                    }
                                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i2);
                                    int i5 = this.a;
                                    if (i5 == 0 || iArrTrimStateSet.length == 0) {
                                        this.d = afbkVar;
                                    }
                                    Object obj = this.c;
                                    if (i5 >= ((int[][]) obj).length) {
                                        int i6 = i5 + 10;
                                        int[][] iArr2 = new int[i6][];
                                        System.arraycopy(obj, 0, iArr2, 0, i5);
                                        this.c = iArr2;
                                        afbk[] afbkVarArr = new afbk[i6];
                                        System.arraycopy(this.b, 0, afbkVarArr, 0, i5);
                                        this.b = afbkVarArr;
                                    }
                                    Object obj2 = this.c;
                                    int i7 = this.a;
                                    ((int[][]) obj2)[i7] = iArrTrimStateSet;
                                    ((afbk[]) this.b)[i7] = afbkVar;
                                    this.a = i7 + 1;
                                }
                            }
                        }
                        if (xml != null) {
                            xml.close();
                            return;
                        }
                        return;
                    }
                } while (next != 1);
                throw new XmlPullParserException("No start tag found");
            } catch (Throwable th) {
                if (xml == null) {
                    throw th;
                }
                try {
                    xml.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            p();
        }
    }

    private final void p() {
        this.d = new afbk();
        this.c = new int[10][];
        this.b = new afbk[10];
    }

    public final oig a() {
        Object obj = this.b;
        obj.getClass();
        if (this.c == null) {
            this.c = "Download result code: ".concat(String.valueOf(((oif) obj).name()));
        }
        return new oig(this);
    }

    public final imi b() {
        Object obj;
        int i = this.a;
        if (i != 0 && (obj = this.c) != null) {
            return new imi(i, (String) obj, (Optional) this.b, (String) this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" containerType");
        }
        if (this.c == null) {
            sb.append(" containerId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null containerId");
        }
        this.c = str;
    }

    public final void d(int i) {
        if (i == 0) {
            throw new NullPointerException("Null containerType");
        }
        this.a = i;
    }

    public final void e(int i) {
        this.b = Optional.of(Integer.valueOf(i));
    }

    public final afbw f() {
        if (this.a == 0) {
            return null;
        }
        return new afbw(this);
    }

    public final alou g() {
        alos alosVar = (alos) alou.a.createBuilder();
        arob arobVarN = n();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        arobVarN.getClass();
        alouVar.d = arobVarN;
        alouVar.c = 177;
        return (alou) alosVar.build();
    }

    public final alou h() {
        alos alosVar = (alos) alou.a.createBuilder();
        arob arobVarN = n();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        arobVarN.getClass();
        alouVar.d = arobVarN;
        alouVar.c = 179;
        return (alou) alosVar.build();
    }

    public final alou i() {
        alos alosVar = (alos) alou.a.createBuilder();
        arob arobVarN = n();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        arobVarN.getClass();
        alouVar.d = arobVarN;
        alouVar.c = 387;
        return (alou) alosVar.build();
    }

    public final alou j() {
        alos alosVar = (alos) alou.a.createBuilder();
        arob arobVarN = n();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        arobVarN.getClass();
        alouVar.d = arobVarN;
        alouVar.c = 329;
        return (alou) alosVar.build();
    }

    public final alou k() {
        alos alosVar = (alos) alou.a.createBuilder();
        arob arobVarN = n();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        arobVarN.getClass();
        alouVar.d = arobVarN;
        alouVar.c = 176;
        return (alou) alosVar.build();
    }

    public final alou l() {
        alos alosVar = (alos) alou.a.createBuilder();
        arob arobVarN = n();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        arobVarN.getClass();
        alouVar.d = arobVarN;
        alouVar.c = 178;
        return (alou) alosVar.build();
    }

    public final alou m() {
        alos alosVar = (alos) alou.a.createBuilder();
        arob arobVarN = n();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        arobVarN.getClass();
        alouVar.d = arobVarN;
        alouVar.c = 341;
        return (alou) alosVar.build();
    }

    public final arob n() {
        return (arob) o().build();
    }

    public final aihf o() {
        aihf aihfVarCreateBuilder = arob.a.createBuilder();
        Object obj = this.d;
        if (obj == null) {
            obj = aigj.d;
        }
        aihfVarCreateBuilder.copyOnWrite();
        arob arobVar = (arob) aihfVarCreateBuilder.instance;
        obj.getClass();
        arobVar.b |= 1;
        arobVar.c = (aigj) obj;
        int i = this.a;
        int i2 = i != 0 ? i : 1;
        aihfVarCreateBuilder.copyOnWrite();
        arob arobVar2 = (arob) aihfVarCreateBuilder.instance;
        arobVar2.d = i2 - 1;
        arobVar2.b |= 2;
        Object obj2 = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        arob arobVar3 = (arob) aihfVarCreateBuilder.instance;
        obj2.getClass();
        arobVar3.b |= 64;
        arobVar3.e = (String) obj2;
        Object obj3 = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        arob arobVar4 = (arob) aihfVarCreateBuilder.instance;
        obj3.getClass();
        arobVar4.b |= SemanticState.Focused;
        arobVar4.f = (String) obj3;
        return aihfVarCreateBuilder;
    }

    public acb(char[] cArr) {
        this.c = "";
        this.b = "";
    }

    public acb() {
    }

    public acb(byte[] bArr, byte[] bArr2) {
        this.b = Optional.empty();
    }

    public acb(imi imiVar) {
        this.b = Optional.empty();
        this.a = imiVar.d;
        this.c = imiVar.a;
        this.b = imiVar.b;
        this.d = imiVar.c;
    }

    public acb(afbw afbwVar) {
        int i = afbwVar.a;
        this.a = i;
        this.d = afbwVar.b;
        this.c = new int[afbwVar.c.length][];
        this.b = new afbk[afbwVar.d.length];
        System.arraycopy(afbwVar.c, 0, this.c, 0, i);
        System.arraycopy(afbwVar.d, 0, this.b, 0, this.a);
    }
}
