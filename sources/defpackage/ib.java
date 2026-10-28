package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import app.rive.semantics.SemanticState;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ib extends MenuInflater {
    static final Class[] a;
    static final Class[] b;
    final Object[] c;
    final Object[] d;
    final Context e;
    public Object f;

    static {
        Class[] clsArr = {Context.class};
        a = clsArr;
        b = clsArr;
    }

    public ib(Context context) {
        super(context);
        this.e = context;
        Object[] objArr = {context};
        this.c = objArr;
        this.d = objArr;
    }

    private final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ColorStateList colorStateList;
        boolean z;
        boolean z2;
        boolean z3;
        ia iaVar = new ia(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(name)));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == 2) {
                if (!z5) {
                    String name2 = xmlPullParser.getName();
                    if (name2.equals("group")) {
                        TypedArray typedArrayObtainStyledAttributes = iaVar.F.e.obtainStyledAttributes(attributeSet, he.p);
                        iaVar.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        iaVar.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        iaVar.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        iaVar.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        iaVar.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        iaVar.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name2.equals("item")) {
                            ib ibVar = iaVar.F;
                            int[] iArr = he.q;
                            Context context = ibVar.e;
                            ahto ahtoVar = new ahto(context, context.obtainStyledAttributes(attributeSet, iArr));
                            iaVar.i = ahtoVar.z(2, 0);
                            iaVar.j = (ahtoVar.w(5, iaVar.c) & (-65536)) | ((char) ahtoVar.w(6, iaVar.d));
                            iaVar.k = ahtoVar.D(7);
                            iaVar.l = ahtoVar.D(8);
                            iaVar.m = ahtoVar.z(0, 0);
                            String strE = ahtoVar.E(9);
                            iaVar.n = strE == null ? (char) 0 : strE.charAt(0);
                            iaVar.o = ahtoVar.w(16, SemanticState.Obscured);
                            String strE2 = ahtoVar.E(10);
                            iaVar.p = strE2 == null ? (char) 0 : strE2.charAt(0);
                            iaVar.q = ahtoVar.w(20, SemanticState.Obscured);
                            if (ahtoVar.H(11)) {
                                iaVar.r = ahtoVar.G(11, false) ? 1 : 0;
                            } else {
                                iaVar.r = iaVar.e;
                            }
                            iaVar.s = ahtoVar.G(3, false);
                            iaVar.t = ahtoVar.G(4, iaVar.f);
                            iaVar.u = ahtoVar.G(1, iaVar.g);
                            iaVar.v = ahtoVar.w(21, -1);
                            iaVar.z = ahtoVar.E(12);
                            iaVar.w = ahtoVar.z(13, 0);
                            iaVar.x = ahtoVar.E(15);
                            iaVar.y = ahtoVar.E(14);
                            String str2 = iaVar.y;
                            if (str2 == null) {
                                iaVar.A = null;
                            } else if (iaVar.w == 0 && iaVar.x == null) {
                                iaVar.A = (axy) iaVar.b(str2, b, ibVar.d);
                            } else {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                iaVar.A = null;
                            }
                            iaVar.B = ahtoVar.D(17);
                            iaVar.C = ahtoVar.D(22);
                            if (ahtoVar.H(19)) {
                                int iW = ahtoVar.w(19, -1);
                                PorterDuff.Mode mode = iaVar.E;
                                Rect rect = lx.a;
                                iaVar.E = a.l(iW, mode);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                iaVar.E = null;
                            }
                            if (ahtoVar.H(18)) {
                                iaVar.D = ahtoVar.A(18);
                            } else {
                                iaVar.D = colorStateList;
                            }
                            ahtoVar.F();
                            iaVar.h = false;
                        } else if (name2.equals("menu")) {
                            xmlPullParser = xmlPullParser;
                            b(xmlPullParser, attributeSet, iaVar.a());
                        } else {
                            str = name2;
                        }
                        z = false;
                    }
                    xmlPullParser = xmlPullParser;
                    z = false;
                }
                z = true;
            } else if (eventType == 3) {
                String name3 = xmlPullParser.getName();
                if (!z5) {
                    z3 = false;
                } else if (name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z = false;
                    str = null;
                } else {
                    z3 = true;
                }
                if (name3.equals("group")) {
                    iaVar.c();
                    z4 = z4;
                    z2 = z3;
                } else if (name3.equals("item")) {
                    if (!iaVar.h) {
                        axy axyVar = iaVar.A;
                        if (axyVar == null || !axyVar.d()) {
                            z4 = z4;
                            z2 = z3;
                            z4 = z4;
                            z2 = z3;
                            iaVar.h = true;
                            iaVar.d(iaVar.a.add(iaVar.b, iaVar.i, iaVar.j, iaVar.k));
                            z4 = z4;
                            z2 = z3;
                        } else {
                            z4 = z4;
                            z2 = z3;
                            iaVar.a();
                            z4 = z4;
                            z2 = z3;
                        }
                    }
                } else if (name3.equals("menu")) {
                    z4 = z4;
                    z2 = z3;
                    z4 = true;
                    z2 = z3;
                }
                z4 = z4;
                z2 = z3;
                z4 = z4;
                z2 = z3;
                z = z2;
                xmlPullParser = xmlPullParser;
            } else {
                z4 = z4;
                z2 = z3;
                z4 = z4;
                z2 = z3;
                z = z2;
                xmlPullParser = xmlPullParser;
            }
            int next = xmlPullParser.next();
            z5 = z;
            eventType = next;
            z4 = z4;
        }
    }

    public final Object a(Object obj) {
        return ((obj instanceof Activity) || !(obj instanceof ContextWrapper)) ? obj : a(((ContextWrapper) obj).getBaseContext());
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof awi)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.e.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof iq) {
                    iq iqVar = (iq) menu;
                    if (!iqVar.h) {
                        iqVar.s();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((iq) menu).r();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((iq) menu).r();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
