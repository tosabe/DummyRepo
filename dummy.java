/**
 * ダミークラス
 * 
 * @author T.abe
 * @since 2014/11/06
 * @version 1.0
 */
public class Dummy extends BasicExecuteAction {
	/*
	 * 画面項目のチェック
	 */
	@Override
	protected boolean chkItem(ActionMessages messages, ActionForm form, HttpServletRequest request) {
		// 画面にチック項目は無いの場合、falseを戻る
		return false;
	}

	protected String executeMethod(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMessages messages, Map<String, Object> mapInfo) {

		return Constants.FORWARD_SUCCESS;
	}
	
	protected String Dummy() {
		return false;
	}

}

