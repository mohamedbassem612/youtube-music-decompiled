package androidx.car.app.model;

import android.text.SpannableString;
import android.text.Spanned;
import defpackage.aad;
import defpackage.yf;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class CarText {
    private final List mSpans;
    private final List mSpansForVariants;
    private final String mText;
    private final List mTextVariants;

    /* JADX INFO: compiled from: PG */
    @yf
    public final class Builder {
        CharSequence mText;
        List mTextVariants = new ArrayList();

        public Builder(CharSequence charSequence) {
            charSequence.getClass();
            this.mText = charSequence;
        }

        public Builder addVariant(CharSequence charSequence) {
            List list = this.mTextVariants;
            charSequence.getClass();
            list.add(charSequence);
            return this;
        }

        public CarText build() {
            return new CarText(this);
        }
    }

    public CarText(Builder builder) {
        this.mText = builder.mText.toString();
        this.mSpans = getSpans(builder.mText);
        List list = builder.mTextVariants;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            CharSequence charSequence = (CharSequence) list.get(i);
            arrayList.add(charSequence.toString());
            arrayList2.add(getSpans(charSequence));
        }
        this.mTextVariants = aad.b(arrayList);
        this.mSpansForVariants = aad.b(arrayList2);
    }

    public static CarText create(CharSequence charSequence) {
        charSequence.getClass();
        return new CarText(charSequence);
    }

    private static CharSequence getCharSequence(String str, List list) {
        SpannableString spannableString = new SpannableString(str);
        for (SpanWrapper spanWrapper : aad.a(list)) {
            spannableString.setSpan(spanWrapper.getCarSpan(), spanWrapper.getStart(), spanWrapper.getEnd(), spanWrapper.getFlags());
        }
        return spannableString;
    }

    private static List getSpans(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, charSequence.length(), Object.class)) {
                if (obj instanceof CarSpan) {
                    arrayList.add(new SpanWrapper(spanned, (CarSpan) obj));
                }
            }
        }
        return aad.b(arrayList);
    }

    public static boolean isNullOrEmpty(CarText carText) {
        return carText == null || carText.isEmpty();
    }

    public static String toShortString(CarText carText) {
        if (carText == null) {
            return null;
        }
        String string = carText.toString();
        if (string.length() <= 16) {
            return string;
        }
        return string.substring(0, 8) + '~' + string.substring(string.length() - 8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarText) {
            CarText carText = (CarText) obj;
            if (Objects.equals(this.mText, carText.mText) && Objects.equals(this.mSpans, carText.mSpans) && Objects.equals(this.mTextVariants, carText.mTextVariants) && Objects.equals(this.mSpansForVariants, carText.mSpansForVariants)) {
                return true;
            }
        }
        return false;
    }

    public List getSpansForVariants() {
        return this.mSpansForVariants;
    }

    public List getVariants() {
        if (this.mTextVariants.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.mTextVariants.size(); i++) {
            arrayList.add(getCharSequence((String) this.mTextVariants.get(i), (List) this.mSpansForVariants.get(i)));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public int hashCode() {
        return Objects.hash(this.mText, this.mSpans, this.mTextVariants, this.mSpansForVariants);
    }

    public boolean isEmpty() {
        return this.mText.isEmpty();
    }

    public CharSequence toCharSequence() {
        return getCharSequence(this.mText, this.mSpans);
    }

    public String toString() {
        return this.mText;
    }

    /* JADX INFO: compiled from: PG */
    @yf
    public class SpanWrapper {
        private final CarSpan mCarSpan;
        private final int mEnd;
        private final int mFlags;
        private final int mStart;

        public SpanWrapper(Spanned spanned, CarSpan carSpan) {
            this.mStart = spanned.getSpanStart(carSpan);
            this.mEnd = spanned.getSpanEnd(carSpan);
            this.mFlags = spanned.getSpanFlags(carSpan);
            this.mCarSpan = carSpan;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SpanWrapper) {
                SpanWrapper spanWrapper = (SpanWrapper) obj;
                if (this.mStart == spanWrapper.mStart && this.mEnd == spanWrapper.mEnd && this.mFlags == spanWrapper.mFlags && Objects.equals(this.mCarSpan, spanWrapper.mCarSpan)) {
                    return true;
                }
            }
            return false;
        }

        public CarSpan getCarSpan() {
            return this.mCarSpan;
        }

        public int getEnd() {
            return this.mEnd;
        }

        public int getFlags() {
            return this.mFlags;
        }

        public int getStart() {
            return this.mStart;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.mStart), Integer.valueOf(this.mEnd), Integer.valueOf(this.mFlags), this.mCarSpan);
        }

        public String toString() {
            return "[" + this.mCarSpan + ": " + this.mStart + ", " + this.mEnd + ", flags: " + this.mFlags + ']';
        }

        SpanWrapper() {
            this.mStart = 0;
            this.mEnd = 0;
            this.mFlags = 0;
            this.mCarSpan = new CarSpan();
        }
    }

    public List getSpans() {
        return this.mSpans;
    }

    private CarText() {
        this.mText = "";
        this.mSpans = Collections.EMPTY_LIST;
        this.mTextVariants = Collections.EMPTY_LIST;
        this.mSpansForVariants = Collections.EMPTY_LIST;
    }

    public CarText(CharSequence charSequence) {
        this.mText = charSequence.toString();
        this.mSpans = getSpans(charSequence);
        this.mTextVariants = Collections.EMPTY_LIST;
        this.mSpansForVariants = Collections.EMPTY_LIST;
    }
}
