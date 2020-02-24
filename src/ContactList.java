public class ContactList {

        Person head;
        public void addNew(Person detail){
            if(head == null) {
                head = detail;
            }
            else{
                detail.next = head;
                head = detail;
            }
        }
        public void print(){
            Person p = head;
            while(p!=null){
                System.out.println(p.firstName+ "  " + p.lastName+"\n"+ p.contactNumber+"\n"+p.emailAddress);
                p = p.next;
            }
        }
        public void delete(){
            if(head == null){
                System.out.println("There is no contact : - ");
            }
            else{
                head = head.next;
            }
        }
        public void search(Person head, String fname)
        {
            Person current = head;
            while (current != null)
            {
                if (current.firstName == fname )
                    System.out.println("found" + current.firstName+""+current.lastName+"\n" + current.contactNumber+"\n" + current.emailAddress);
                current = current.next;

            }
            System.out.println("No matches found. ");
        }


    }

