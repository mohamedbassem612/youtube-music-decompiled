package androidx.car.app.model;

import defpackage.abn;
import defpackage.yf;
import defpackage.zr;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public final class Action {
    public static final int FLAG_DEFAULT = 4;
    public static final int FLAG_IS_PERSISTENT = 2;
    public static final int FLAG_PRIMARY = 1;
    public static final int TYPE_CUSTOM = 1;
    static final int TYPE_STANDARD = 65536;
    private final CarColor mBackgroundColor;
    private final int mFlags;
    private final CarIcon mIcon;
    private final boolean mIsEnabled;
    private final abn mOnClickDelegate;
    private final CarText mTitle;
    private final int mType;
    public static final int TYPE_APP_ICON = 65538;
    public static final Action APP_ICON = new Action(TYPE_APP_ICON);
    public static final int TYPE_COMPOSE_MESSAGE = 65541;
    public static final Action COMPOSE_MESSAGE = new Action(TYPE_COMPOSE_MESSAGE);
    public static final int TYPE_BACK = 65539;
    public static final Action BACK = new Action(TYPE_BACK);
    public static final int TYPE_PAN = 65540;
    public static final Action PAN = new Action(TYPE_PAN);
    public static final int TYPE_MEDIA_PLAYBACK = 65542;
    public static final Action MEDIA_PLAYBACK = new Action(TYPE_MEDIA_PLAYBACK);

    Action(zr zrVar) {
        CarText carText = zrVar.b;
        this.mTitle = null;
        CarIcon carIcon = zrVar.c;
        this.mIcon = null;
        CarColor carColor = zrVar.e;
        this.mBackgroundColor = null;
        abn abnVar = zrVar.d;
        this.mOnClickDelegate = null;
        int i = zrVar.f;
        this.mType = 0;
        int i2 = zrVar.g;
        this.mFlags = 0;
        boolean z = zrVar.a;
        this.mIsEnabled = false;
    }

    static boolean isStandardActionType(int i) {
        return (i & TYPE_STANDARD) != 0;
    }

    public static String typeToString(int i) {
        if (i == 1) {
            return "CUSTOM";
        }
        switch (i) {
            case TYPE_APP_ICON /* 65538 */:
                return "APP_ICON";
            case TYPE_BACK /* 65539 */:
                return "BACK";
            case TYPE_PAN /* 65540 */:
                return "PAN";
            case TYPE_COMPOSE_MESSAGE /* 65541 */:
                return "COMPOSE_MESSAGE";
            case TYPE_MEDIA_PLAYBACK /* 65542 */:
                return "MEDIA_PLAYBACK";
            default:
                return "<unknown>";
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Action) {
            Action action = (Action) obj;
            if (Objects.equals(this.mTitle, action.mTitle) && this.mType == action.mType && Objects.equals(this.mIcon, action.mIcon)) {
                if (Objects.equals(Boolean.valueOf(this.mOnClickDelegate == null), Boolean.valueOf(action.mOnClickDelegate == null)) && Objects.equals(this.mBackgroundColor, action.mBackgroundColor) && Objects.equals(Integer.valueOf(this.mFlags), Integer.valueOf(action.mFlags)) && this.mIsEnabled == action.mIsEnabled) {
                    return true;
                }
            }
        }
        return false;
    }

    public CarColor getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public CarIcon getIcon() {
        return this.mIcon;
    }

    public abn getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public CarText getTitle() {
        return this.mTitle;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, Integer.valueOf(this.mType), Boolean.valueOf(this.mOnClickDelegate == null), this.mIcon, this.mBackgroundColor, Integer.valueOf(this.mFlags), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean isStandard() {
        return isStandardActionType(this.mType);
    }

    public String toString() {
        return "[type: " + typeToString(this.mType) + ", icon: " + this.mIcon + ", bkg: " + this.mBackgroundColor + ", isEnabled: " + this.mIsEnabled + ']';
    }

    private Action(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Standard action constructor used with non standard type");
        }
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.DEFAULT;
        this.mOnClickDelegate = null;
        this.mType = i;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }

    private Action() {
        this.mTitle = null;
        this.mIcon = null;
        this.mBackgroundColor = CarColor.DEFAULT;
        this.mOnClickDelegate = null;
        this.mType = 1;
        this.mFlags = 0;
        this.mIsEnabled = true;
    }
}
