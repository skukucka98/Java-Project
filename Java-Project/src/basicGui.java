import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;

public class basicGui {

	protected Shell shell;
	private Text itemName;
	private Text itemQuantity;
	private Text binNumber;
	private Button btnShowDatabase;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			basicGui window = new basicGui();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 433);
		shell.setText("Database GUI");
		
		itemName = new Text(shell, SWT.BORDER);
		itemName.setBounds(209, 7, 76, 21);
		
		itemQuantity = new Text(shell, SWT.BORDER);
		itemQuantity.setBounds(209, 37, 76, 21);
		
		binNumber = new Text(shell, SWT.BORDER);
		binNumber.setBounds(209, 64, 76, 21);
		
		Label lblItemName = new Label(shell, SWT.NONE);
		lblItemName.setBounds(122, 10, 81, 21);
		lblItemName.setText("Item Name:");
		
		Label lblItemQuantity = new Label(shell, SWT.NONE);
		lblItemQuantity.setBounds(122, 40, 81, 21);
		lblItemQuantity.setText("Item Quantity:");
		
		Label lblBinNumber = new Label(shell, SWT.NONE);
		lblBinNumber.setBounds(122, 67, 81, 21);
		lblBinNumber.setText("Bin Number:");
		
		Button btnAddToDatabase = new Button(shell, SWT.NONE);
		btnAddToDatabase.setBounds(149, 110, 122, 25);
		btnAddToDatabase.setText("Add to Database");
		
		btnShowDatabase = new Button(shell, SWT.NONE);
		btnShowDatabase.setBounds(149, 141, 122, 25);
		btnShowDatabase.setText("Show Database");

	}
}
