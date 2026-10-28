package androidx.car.app.dialer;

import androidx.car.app.model.Action;
import androidx.car.app.model.Header;
import defpackage.aaz;
import defpackage.acz;
import defpackage.yf;
import defpackage.yk;
import defpackage.yo;
import defpackage.yp;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class TelephoneKeypadTemplate implements acz {
    public static final int KEY_EIGHT = 8;
    public static final int KEY_FIVE = 5;
    public static final int KEY_FOUR = 4;
    public static final int KEY_NINE = 9;
    public static final int KEY_ONE = 1;
    public static final int KEY_POUND = 11;
    public static final int KEY_SEVEN = 7;
    public static final int KEY_SIX = 6;
    public static final int KEY_STAR = 10;
    public static final int KEY_THREE = 3;
    public static final int KEY_TWO = 2;
    public static final int KEY_ZERO = 0;
    private final Header mHeader;
    private final Map mKeySecondaryTexts;
    private final String mPhoneNumber;
    private final aaz mPhoneNumberChangedDelegate;
    private final Action mPrimaryAction;
    private final yk mTelephoneKeypadCallbackDelegate;

    private TelephoneKeypadTemplate(yo yoVar) {
        Header header = yoVar.d;
        this.mHeader = null;
        String str = yoVar.e;
        this.mPhoneNumber = null;
        Action action = yoVar.a;
        this.mPrimaryAction = null;
        yk ykVar = yoVar.f;
        this.mTelephoneKeypadCallbackDelegate = null;
        aaz aazVar = yoVar.b;
        this.mPhoneNumberChangedDelegate = null;
        Map map = yoVar.c;
        this.mKeySecondaryTexts = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TelephoneKeypadTemplate) {
            TelephoneKeypadTemplate telephoneKeypadTemplate = (TelephoneKeypadTemplate) obj;
            if (Objects.equals(this.mHeader, telephoneKeypadTemplate.mHeader) && Objects.equals(this.mPhoneNumber, telephoneKeypadTemplate.mPhoneNumber) && Objects.equals(this.mPrimaryAction, telephoneKeypadTemplate.mPrimaryAction)) {
                if ((this.mTelephoneKeypadCallbackDelegate == null) == (telephoneKeypadTemplate.mTelephoneKeypadCallbackDelegate == null)) {
                    if ((this.mPhoneNumberChangedDelegate == null) == (telephoneKeypadTemplate.mPhoneNumberChangedDelegate == null) && this.mKeySecondaryTexts.size() == telephoneKeypadTemplate.mKeySecondaryTexts.size() && this.mKeySecondaryTexts.entrySet().containsAll(telephoneKeypadTemplate.mKeySecondaryTexts.entrySet())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public Map getKeySecondaryTexts() {
        return this.mKeySecondaryTexts;
    }

    public String getPhoneNumber() {
        return this.mPhoneNumber;
    }

    public aaz getPhoneNumberChangedDelegate() {
        return this.mPhoneNumberChangedDelegate;
    }

    public Action getPrimaryAction() {
        return this.mPrimaryAction;
    }

    public yk getTelephoneKeypadCallbackDelegate() {
        return this.mTelephoneKeypadCallbackDelegate;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader, this.mPhoneNumber, this.mPrimaryAction, Boolean.valueOf(this.mTelephoneKeypadCallbackDelegate == null), Boolean.valueOf(this.mPhoneNumberChangedDelegate == null), this.mKeySecondaryTexts);
    }

    public String toString() {
        return "TelephoneKeypadTemplate { header: " + this.mHeader + "; phone number: " + this.mPhoneNumber + "; primaryAction: " + this.mPrimaryAction + "; secondaryTextMap: " + this.mKeySecondaryTexts + " }";
    }

    public TelephoneKeypadTemplate() {
        this.mHeader = null;
        this.mPhoneNumber = null;
        this.mPrimaryAction = null;
        this.mTelephoneKeypadCallbackDelegate = null;
        this.mPhoneNumberChangedDelegate = null;
        this.mKeySecondaryTexts = new HashMap(0);
    }

    /* synthetic */ TelephoneKeypadTemplate(yo yoVar, yp ypVar) {
        this(yoVar);
    }
}
