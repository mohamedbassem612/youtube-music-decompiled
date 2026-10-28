package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class asd {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public asd(Context context, XmlPullParser xmlPullParser) {
        this.c = new ArrayList();
        this.b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), asp.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.a = typedArrayObtainStyledAttributes.getResourceId(0, this.a);
            } else if (index == 1) {
                this.b = typedArrayObtainStyledAttributes.getResourceId(1, this.b);
                String resourceTypeName = context.getResources().getResourceTypeName(this.b);
                context.getResources().getResourceName(this.b);
                if ("layout".equals(resourceTypeName)) {
                    asl aslVar = new asl();
                    this.d = aslVar;
                    aslVar.d(context, this.b);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
        this.c = attribute;
        this.d = obj;
        this.a = i;
        this.b = i2;
    }

    public asd(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
        a(attribute, obj, i, i2);
    }

    public asd(Object obj, int i, int i2) {
        a(i.a, obj, i, i2);
    }
}
