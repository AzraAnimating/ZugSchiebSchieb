public class Stack<ContentType> 
{

    private class StackNode 
    {

        private ContentType content = null;
        private StackNode lastNode = null;

        public StackNode(ContentType pContent) 
        {
            content = pContent;
        }

        public void setLast(StackNode pLast)
        {
            lastNode = pLast;
        }

        public StackNode getLast() 
        {
            return lastNode;
        }


        public ContentType getContent() 
        {
            return content;

        }
    }


        private StackNode top;
        private StackNode previousNode;


        public Stack() 
        {
            top = null;
            previousNode = null;
        }

        public boolean isEmpty() 
        {
            return top == null;
        }


        public void push(ContentType pContent) 
        {

            if (pContent != null) 
            {
                StackNode newNode = new StackNode(pContent);
                if (this.isEmpty()) {
                    top = newNode;
                    previousNode = newNode;
                } 
                else 
                {
                    newNode.setLast(previousNode);
                    top = newNode;
                    previousNode = top;
                }
            }
        }

        public void pop() 
        {
            if (!this.isEmpty()) 
            {
                top = top.getLast();
                previousNode = top;

                if (this.isEmpty())
                {
                    top = null;
                }
            }
        }

        public ContentType top()
        {
            if (this.isEmpty()) 
            {
                return null;
            } 
            else 
            {
                return top.getContent();
            }
        }
}
